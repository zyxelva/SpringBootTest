package com.zyx.mvn.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application
{

	public static void main(String[] args)
	{
		SpringApplication.run(applicationClass, args);
	}

	private static Class<Application> applicationClass = Application.class;

	@RequestMapping("/")
	public String helloWorld()
	{
		return "Hello World!";
	}

	@RequestMapping("/framework")
	public String helloWorld2()
	{
		return "+++++++++++++++++Hello World2+++++++++++++++++++++!";
	}

	@RequestMapping("/framework3")
	public String helloWorld3()
	{
		return "+++++++++++++++++Hello World2+++++++++++++++++++++!";
	}
}
