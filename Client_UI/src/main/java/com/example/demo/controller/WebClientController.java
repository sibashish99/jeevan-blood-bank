package com.example.demo.controller;

import java.util.Arrays;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


import com.example.demo.entity.Donor;
import com.example.demo.entity.DonorCamp;


@Controller
public class WebClientController {
	
	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private Donor object;
	
	@Autowired
	private DonorCamp object2;
	
	@Autowired
	private RestTemplate template;
	

	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String init(Model model) {
		 model.addAttribute("majHeading","ABC BloodBank");
		 return "index";
	}
	@GetMapping(path="/alreadyRegistered")
	public String alreadyregistered(Model model) {
		model.addAttribute("majHeading","Welcome Back Donor");
		return "alreadyRegistered";
	}
	

	@GetMapping(path="/addDonor")
	public String sendForm(Model model) {
		model.addAttribute("command",object);
		return "addDonor"; 
	}

	@PostMapping(path = "/addDonor")
    public String submitForm(@ModelAttribute("command") Donor donor,BindingResult result) {
        String nextStep = "success";
       
   
        if(result.hasErrors()) {
            nextStep="addDonor";
        }else {
        	HttpHeaders headers=new HttpHeaders();
        	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        	headers.setContentType(MediaType.APPLICATION_JSON);
        	HttpEntity<Donor> requestBody=new HttpEntity<>(donor,headers);
        	template.postForObject("http://localhost:7000/api/v1/donor",requestBody, Donor[].class);
        }
        return "redirect:/getAllDonor";
    }
	

	@GetMapping(path = "/getAllDonor")
	public String findAll(Model model) {

	Donor[] resp =template.getForObject("http://localhost:7000/api/v1/donor",
	Donor[].class);

	model.addAttribute("data",resp);
	return "showAllDonors";

	}
	

	@GetMapping(path = "/searchByBloodGroup")
	public String searchBybloodgroup(Model model,@RequestParam("search") String bloodgroup) {


	Donor[] resp =template.getForObject("http://localhost:7000/api/v1/donor/"+bloodgroup,
	Donor[].class);

	model.addAttribute("donors",resp);
	return "findByBloodGroup";

	}
	

	@GetMapping(path = "/searchByarea")
	public String searchByareacode(Model model,@RequestParam("search") int  areacode) {


	Donor[] resp =template.getForObject("http://localhost:7000/api/v1/donor/srch/"+areacode,
	Donor[].class);

	model.addAttribute("data",resp);
	return "searchBycode";
	}
	
	

	@DeleteMapping(path="/delete")
	public String deleteRecord(Model model,@RequestParam("search") int id) {
		template.delete("http://localhost:7000/api/v1/donor/delete/"+id);
		return "successfull";
	}
	

	@GetMapping(path = "/searchBycamp")
	public String searchBycamp(Model model,@RequestParam("search") int  campname) {

	DonorCamp[] resp =template.getForObject("http://localhost:7010/api/v1/donorcamp/srchbycampname/"+campname,
	DonorCamp[].class);

	model.addAttribute("data2",resp);
	return "donorsOfcamp";
	}
	
	@GetMapping(path = "/searchCampsByArea")
	public String searchCampByAreaCode(Model model,@RequestParam("search") int  areacode) {

	DonorCamp[] resp =template.getForObject("http://localhost:7010/api/v1/donorcamp/srchbyareacode/"+areacode,
	DonorCamp[].class);

	model.addAttribute("data",resp);
	return "searchCampsByArea";
	}
	

	@GetMapping(path="/campRegister")
	public String sendForm2(Model model) {
		model.addAttribute("command2",object2);
		return "registerForCamp";
	}
	
	
	
	@PostMapping(path = "/campRegister")
    public String submitForm2(@ModelAttribute("command2") DonorCamp donorcamp,BindingResult result) {
        String nextStep = "success";  
        if(result.hasErrors()) {
            nextStep="registerForCamp";
        }else {
        	HttpHeaders headers=new HttpHeaders();
        	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        	headers.setContentType(MediaType.APPLICATION_JSON);
        	HttpEntity<DonorCamp> requestBody=new HttpEntity<>(donorcamp,headers);
        	template.postForObject("http://localhost:7010/api/v1/donorcamp",requestBody, DonorCamp[].class);
        }
        return "successfull";
    }
	

	@GetMapping(path = "/getAllDonorCamps")
	public String findAllDonorCamps(Model model) {

	DonorCamp[] resp =template.getForObject("http://localhost:7010/api/v1/donorcamp",
	DonorCamp[].class);

	model.addAttribute("data",resp);
	return "showAllDonorCamps";

	}
	
	

	
	
}
