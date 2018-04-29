package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {
	
	@Autowired
	private PeopleRepository peopleRepository;
	@Autowired
	private PeopleService peopleService;
	
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
	public People peopleFindOne(@RequestParam("id") Integer id)
	{
		Optional<People> o = peopleRepository.findById(id);
		return o.get();
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
		people.setId(id);;
		return peopleRepository.save(people);
	}
	
	//删除一个人
	@DeleteMapping(value="/peoples/{id}")
	public void deletePeople(@RequestParam("id") Integer id)
	{
		peopleRepository.deleteById(id);
	}
	
	//通过年龄查询人群列表
	@GetMapping(value="/peoples/age/{age}")
	public List<People> peopleListByAge(@RequestParam("age") Integer age)
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



