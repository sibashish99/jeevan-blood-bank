package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Donor;


@Repository
public interface DonorRepository extends JpaRepository<Donor, Integer> {

	public List<Donor> findAllById(int n);
	public List<Donor> findBybloodgroup(String s);
//	@Query(nativeQuery = true,value = "update donor set bloodgroup =:group where id =:id")
//	@Modifying
//	@Transactional
//	public int updateBlood(@Param("id")int id,@Param("bloodgroup")String blood);
	public List<Donor> findByareacode(int n);
	public Donor findByid(int x);

}
