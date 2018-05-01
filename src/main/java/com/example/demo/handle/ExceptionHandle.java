package com.example.demo.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Result;
import com.example.demo.exception.PeopleException;
import com.example.demo.utils.ResultUtil;

@ControllerAdvice
public class ExceptionHandle {
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result handle(Exception e)
	{
		if(e instanceof PeopleException) {
			PeopleException peopleException = (PeopleException)e;
			return ResultUtil.error(peopleException.getCode(), peopleException.getMessage());
		}
		return ResultUtil.error(-1, "未知错误");
	}
	
	
}
