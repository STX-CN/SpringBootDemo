package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.People;
import com.example.demo.service.PeopleService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PeopleServiceTest {
	
	private final static Logger logger = LoggerFactory.getLogger(PeopleServiceTest.class);
	
	@Autowired
	private PeopleService peopleService;
	
	@Test
	public void findOneTest()
	{
		People people = peopleService.findOne(1);
		Assert.assertEquals(new Integer(18), people.getAge());
	}
	
}
