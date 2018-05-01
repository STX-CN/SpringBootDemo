package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/demo")
public class BaseController {
	
//	@RequestMapping(value= "/hello", method = RequestMethod.GET)
	@GetMapping(value="/hello")
	public @ResponseBody String say(@RequestParam(value="id", required=false, defaultValue="100")int id)
	{
		return "id:" + id;
	}
	
}
