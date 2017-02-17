package com.sky.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyException {

	@ExceptionHandler({ Exception.class })
	public String dueException(Exception e){
		System.out.println(2222);
		e.printStackTrace();
		return "index";
	}
}
