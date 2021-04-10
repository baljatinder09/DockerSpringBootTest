package com.test.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
@Configuration
public class MyService {

	
	public MyService()
	{
		System.out.println("MyService called");
	}
	
	
	@Bean
	public MyBean myBean()
	{
		return new MyBean();
	}
	
	public String show() {
		return "Hello";
	}
}
