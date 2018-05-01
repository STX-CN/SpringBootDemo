package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.People;
import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.PeopleException;
import com.example.demo.repository.PeopleRepository;

@Service
public class PeopleService {
	
	@Autowired
	private PeopleRepository peopleRepositoy;
	
	//支持事物处理
	@Transactional
	public void insertTwo()
	{
		People peopleA = new People();
		peopleA.setId(30);
		peopleA.setName("lucy1");
		peopleA.setAge(11);
		peopleRepositoy.save(peopleA);
		People peopleB = new People();
		peopleB.setId(31);
		peopleB.setName("hx");
		peopleB.setAge(17);
		peopleRepositoy.save(peopleB);
	}
	
	public void getAge(Integer id) throws Exception
	{
		People people = peopleRepositoy.findOne(id);
		Integer age = people.getAge();
		if(age < 10)
		{
			throw new PeopleException(ResultEnum.PRIMARY_SCHOOL);
		}else if(age > 10 && age < 16)
		{
			throw new PeopleException(ResultEnum.MIDDLE_SCHOOL);
		}else if(age > 16 && age < 24)
		{
			throw new PeopleException(ResultEnum.COLLEGE_SCHOOL);
		}else {
			throw new PeopleException(ResultEnum.SOCIAL_SCHOOL);
		}
	}
	
	/**
	 * 通过Id查询一个人的返回信息
	 * @param id
	 * @return
	 */
	public People findOne(Integer id)
	{
		return peopleRepositoy.findOne(id);
	}
	
}


