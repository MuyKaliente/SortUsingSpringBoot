package com.in28minutes.firstspringproject.firstspringproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm {

	public int Sort(int[] listOfNumbers)
	{
		System.out.println("Hi, I'm in BubbleSort!");
		return 3;
	}
}
