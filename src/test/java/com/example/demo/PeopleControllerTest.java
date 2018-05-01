package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PeopleControllerTest {
	private final static Logger logger = LoggerFactory.getLogger(PeopleControllerTest.class);
	
	@Autowired
	private MockMvc mvc;
	
	
	@Test
	public void peopleListTest() throws Exception
	{
		   mvc.perform(MockMvcRequestBuilders.get("/peoples"))
           .andExpect(MockMvcResultMatchers.status().isOk());
//对返回数据内容进行判断		   
//	        .andExpect(MockMvcResultMatchers.content().string("abc"));
	}
	
}




