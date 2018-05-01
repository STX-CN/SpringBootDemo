package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.People;
import com.example.demo.domain.Result;
import com.example.demo.repository.PeopleRepository;
import com.example.demo.service.PeopleService;
import com.example.demo.utils.ResultUtil;

@RestController
public class PeopleController {
	
	private final static Logger logger = LoggerFactory.getLogger(PeopleController.class);
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
		logger.info("peopleList");
		return peopleRepository.findAll();
	}
	
	/*
	 * 增加一个人
	 * 
	 */
	@PostMapping(value="/peoples")
	public Result<People> peopleAdd(@Valid People people, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors()) {
			return null;
			//	return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
		}		
		People newPeople = new People();
		newPeople.setName(people.getName());
		newPeople.setAge(people.getAge());
		newPeople.setMoney(people.getMoney());
		return ResultUtil.success(peopleRepository.save(newPeople));
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
	
	@GetMapping(value="/peoples/getAge/{id}")
	public void  getAge(@PathVariable("id") Integer id) throws Exception
	{
		peopleService.getAge(id);
	}
	
}



