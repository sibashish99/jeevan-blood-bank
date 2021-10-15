package com.example.demo.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.repo.DonorCampRepository;
import com.example.demo.service.DonorCampService;
import com.example.demo.table.DonorCamp;


@Service
public class DonorCampServiceImpl implements DonorCampService {
	@Autowired
	private DonorCampRepository repo;

	@Override
	public DonorCamp addCamp( DonorCamp camp) {
		// TODO Auto-generated method stub
		return repo.save(camp);
	}

	@Override
	public List<DonorCamp> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<DonorCamp> searchByCampname(int s) {
		// TODO Auto-generated method stub
		return repo.findBycampname(s);
	}

	@Override
	public List<DonorCamp> searchByAreacode(int x) {
		// TODO Auto-generated method stub
		return repo.findByareacode(x);
	}


	
	

}
