package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Donor;

public interface DonorService {
	
	Donor addDonor(Donor d);
	List<Donor> getAll();
	List<Donor> searchBycode(int n);
	int delete(int n);
	Donor update(Donor d,int id);
	List<Donor> searchBygroup(String s);

}
