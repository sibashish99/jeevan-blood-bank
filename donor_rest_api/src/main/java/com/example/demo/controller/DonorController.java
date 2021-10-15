package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.entity.Donor;
import com.example.demo.service.DonorService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path="/api/v1/donor")
public class DonorController {
	@Autowired
	private WebClient.Builder client;
	
	private DonorService service;
	
	
	public DonorController(DonorService service) {
		super();
		this.service = service;
	}


	@GetMapping(path="/welcome")
	public String welcome() {
		return "hello";
	}
	@PostMapping
	public ResponseEntity<Donor> addDonor(@RequestBody Donor d){
		return new ResponseEntity<Donor>(service.addDonor(d),HttpStatus.CREATED);
	}
	@GetMapping
	public List<Donor> getAll(){
		return service.getAll();
	}
	
	@GetMapping(path="/srch/{areacode}")
	public List<Donor> searchBycode(@PathVariable("areacode") int n){
		return service.searchBycode(n);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int n){
		int count =  service.delete(n);
		HttpStatus status = HttpStatus.NOT_FOUND;
		String message="Record Not Found";
		
		if(count==1){
			
		        status=HttpStatus.OK;
				message =" One Record Deleted";
		}
		return ResponseEntity.status(status).body(message);
	}
	
	@PutMapping(path="/update/{id}")
	public ResponseEntity<Donor> update(@RequestBody Donor d, @PathVariable("id") int n){

		return new ResponseEntity<Donor>(service.update(d,n),HttpStatus.OK);
	}
//	
	@GetMapping(path="/{bloodgroup}")
	public List<Donor> searchBygroup(@PathVariable("bloodgroup") String blood) {
		return service.searchBygroup(blood);
	}
	
	@GetMapping(path="/detailsofcamps")
	public Flux<String> findCamps(){

	return client.build().get().uri("http://localhost:7010/api/v1/donorcamp").retrieve().bodyToFlux(String.class);
	}
	
	@GetMapping(path="/detailsofcamps/{areacode}")
	public Flux<String> findCampsByareacode(@PathVariable("areacode") int  n){

	return client.build().get().uri("http://localhost:7010/api/v1/donorcamp"+"/{areacode}",n).retrieve().bodyToFlux(String.class);
	}
	

}
