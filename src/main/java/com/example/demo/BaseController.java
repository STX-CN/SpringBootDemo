package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@Value("${age}")
	private int age;
	
	@Value("${nation}")
	private String nation;
	
	@Value("${content}")
	private String content;
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String say()
	{
		return content;
	}
	
	
	
}
