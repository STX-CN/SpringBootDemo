package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;

public class PeopleException extends RuntimeException{
	
	private Integer code;
	
	public PeopleException(Integer code, String message)
	{
		super(message);
		this.code = code;
	}
	
	public PeopleException(ResultEnum resultEnum)
	{
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
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
