package com.example.demo.exception;

public class PeopleException extends RuntimeException{
	
	private Integer code;
	
	public PeopleException(Integer code, String message)
	{
		super(message);
		this.code = code;
	}
	
	public void setCode(int code)
	{
		this.code = code;
	}
	public Integer getCode()
	{
		return code;
	}
	
}
