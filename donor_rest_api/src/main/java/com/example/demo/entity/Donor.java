package com.example.demo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="donor")
@NoArgsConstructor
@AllArgsConstructor

public class Donor {

	@Id
	@Column(name="id")
	int id;
	

	@Column(name="donorname")
	String donorname;
	
	@Column(name="age")
	int age;
	
	@Column(name="bloodgroup")
	String bloodgroup;
	

	@Column(name="areacode")
	int areacode;


}
