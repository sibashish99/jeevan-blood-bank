package com.example.demo.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.table.DonorCamp;

public interface DonorCampRepository extends JpaRepository<DonorCamp, Integer> {

	public List<DonorCamp> findBycampname(int s);

	public List<DonorCamp> findByareacode(int s);

//	public DonorCamp findAllById(int x);

//	DonorCamp findAllById(int x);




}
