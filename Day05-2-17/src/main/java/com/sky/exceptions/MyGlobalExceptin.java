package com.sky.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyGlobalExceptin {

	@ExceptionHandler({ Exception.class })
	public String getException(Exception e){
		System.out.println("1");
		e.printStackTrace();
		return "show";
	}
}
