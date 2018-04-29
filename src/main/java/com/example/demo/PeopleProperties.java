package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "people")
public class PeopleProperties {
	private int age;
	private String nation;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getNation()
	{
		return nation;
	}
	public void setNation(String nation)
	{
		this.nation = nation;
	}
}
