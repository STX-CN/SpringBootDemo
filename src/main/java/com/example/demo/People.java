package com.example.demo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class People {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer	  age;
	
	public People()
	{
	}

	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
}
