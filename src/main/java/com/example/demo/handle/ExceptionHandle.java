package com.example.demo.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Result;
import com.example.demo.utils.ResultUtil;

@ControllerAdvice
public class ExceptionHandle {
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result handle(Exception e)
	{
		return ResultUtil.error(100, e.getMessage());
	}
	
	
}
