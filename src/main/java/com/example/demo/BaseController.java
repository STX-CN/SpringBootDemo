package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/demo")
public class BaseController {
	
	@RequestMapping(value= "/hello", method = RequestMethod.GET)
	public @ResponseBody String say(@RequestParam("id")int id)
	{
		return "id:" + id;
	}
	
}
