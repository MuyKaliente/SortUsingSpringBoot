package com.in28minutes.firstspringproject.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstspringprojectApplication {

	public static void main(String[] args) {
		
		//Call Binary Search Here
		//Binary Search depends on a SortAlgorithm
		
		//Get the application context from here and then get the beans
		ApplicationContext applicationContext = SpringApplication.run(FirstspringprojectApplication.class, args);
		BinarySearch binarySearchBean = applicationContext.getBean(BinarySearch.class);
		int index = binarySearchBean.BinarySearchFunc(new int [] {1,2,3});
		System.out.println(index);
	}
}
