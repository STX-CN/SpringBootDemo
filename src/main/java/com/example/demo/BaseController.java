package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@Autowired
	private PeopleProperties peopleProp;
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String say()
	{
		return peopleProp.getNation() + peopleProp.getAge();
	}
	
	
	
}
