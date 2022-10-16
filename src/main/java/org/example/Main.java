package org.example;

import org.example.entities.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args)
	{
		System.out.println("Hello world!");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Cat cat = context.getBean("mya", Cat.class);
		System.out.println("I am the cat, my name is " + cat.getName());

		context.close();
	}
}