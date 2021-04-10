package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DockerSpringBootTestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DockerSpringBootTestApplication.class, args);
		MyService s=ctx.getBean(MyService.class);
		//s.myBean();
	}

}
