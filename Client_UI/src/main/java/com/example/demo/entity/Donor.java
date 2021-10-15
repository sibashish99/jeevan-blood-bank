package com.example.demo.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Donor {
	
	@Range(min=1 ,max=4,message ="ID should contain 1 to 4 digit")
	int id;
	
	@Length(min=3 ,max=10,message ="Name should be 3 to 10 characters")
	String donorname;
	
	@Range(min=2 ,max=3,message ="Age should be atleast 2 digits")
	int age;
	
	@Length(min=3 ,max=4,message ="bloodgroup should be 3 to 4 characters")
	String bloodgroup;
	
	@Range(min=2 ,max=4,message ="AreaCode should be atleast 2 digits and Max 4 digits")
	int areacode;



}
