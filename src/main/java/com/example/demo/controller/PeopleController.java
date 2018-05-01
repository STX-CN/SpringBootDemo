package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.People;
import com.example.demo.repository.PeopleRepository;
import com.example.demo.service.PeopleService;

@RestController
public class PeopleController {
	
	@Autowired
	private PeopleService peopleService;
	@Autowired
	private PeopleRepository peopleRepository;
	
	/*
	 * 查询群众列表
	 * 
	 */
	@GetMapping(value="/peoples")
	public List<People> peopleList(){
		return peopleRepository.findAll();
	}
	
	/*
	 * 增加一个人
	 * 
	 */
	@PostMapping(value="/peoples")
	public People peopleAdd(@RequestParam("name") String name,
			@RequestParam("age") Integer age)
	{
		People people = new People();
		people.setName(name);
		people.setAge(age);
		return peopleRepository.save(people);
	}
	
	//查询一个人
	@GetMapping(value="/peoples/{id}")
	public People peopleFindOne(@PathVariable("id") Integer id)
	{
		return peopleRepository.findOne(id);
	}
	
	//更新一个人
	@PostMapping(value="/peoples/{id}")
	public People updatePeople(@RequestParam("id") Integer id,
			@RequestParam("name") String name,
			@RequestParam("age") Integer age)
	{
		People people = new People();
		people.setAge(age);
		people.setName(name);
		people.setId(id);
		return peopleRepository.save(people);
	}
	
	//删除一个人
	@DeleteMapping(value="/peoples/{id}")
	public void deletePeople(@PathVariable("id") Integer id)
	{
		peopleRepository.delete(id);
	}
	
	//通过年龄查询人群列表
	@GetMapping(value="/peoples/age/{age}")
	public List<People> peopleListByAge(@PathVariable("age") Integer age)
	{
		return peopleRepository.findByAge(age);
	}
	
	//更新一个人
	@PostMapping(value="/peoples/two")
	public void peopleTwo()
	{
		peopleService.insertTwo();
	}
}



