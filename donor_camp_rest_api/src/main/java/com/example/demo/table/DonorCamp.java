package com.example.demo.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="donorcamp")

public class DonorCamp {
	
	@Id
	@Column(name="campname")
	int  campname;
	
	@Column(name="donorname")
	String donorname;
	
	@Column(name="address")
	String address;
	
	@Column(name="areacode")
	int areacode;
	

}
