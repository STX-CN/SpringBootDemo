package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/demo")
public class BaseController {
	
	@Autowired
	private PeopleProperties peopleProp;
	
	@RequestMapping(value= "/hello/{id}", method = RequestMethod.GET)
	public String say(@PathVariable("id")int id)
	{
		return "id:" + id;
	}
	
	
	
}
