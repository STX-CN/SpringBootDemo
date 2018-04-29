package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/demo")
public class BaseController {
	
	@Autowired
	private PeopleProperties peopleProp;
	
	@RequestMapping(value= {"/hello", "hi"}, method = RequestMethod.GET)
	public String say()
	{
		return peopleProp.getNation() + peopleProp.getAge();
	}
	
	
	
}
