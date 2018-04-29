package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PeopleService {
	
	@Autowired
	private PeopleRepository peopleRepositoy;
	
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
	
}
