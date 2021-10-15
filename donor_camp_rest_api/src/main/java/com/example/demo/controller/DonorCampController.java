package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DonorCampService;
import com.example.demo.table.DonorCamp;

@RestController
@RequestMapping(path="/api/v1/donorcamp")
public class DonorCampController {
	
	private DonorCampService service;
	
	
	public DonorCampController(DonorCampService service) {
		super();
		this.service = service;
	}
	@GetMapping(path="/welcome")
	public String camp() {
		return "Welcome to Donor Camp";
	}
	@PostMapping
	public ResponseEntity<DonorCamp> addCamp(@RequestBody DonorCamp d){
		return new ResponseEntity<DonorCamp>(service.addCamp(d),HttpStatus.CREATED);
	}
	

	@GetMapping
	public List<DonorCamp> getAll(){
		return this.service.getAll();
	}
	
	@GetMapping(path="/srchbycampname/{campname}")
	public List<DonorCamp> searchByCampname(@PathVariable("campname") int s) {
		return 	service.searchByCampname(s);
	}
	
	@GetMapping(path="/srchbyareacode/{areacode}")
	public List<DonorCamp> searchByAreacode(@PathVariable("areacode") int s) {
		return service.searchByAreacode(s);
	}



}
