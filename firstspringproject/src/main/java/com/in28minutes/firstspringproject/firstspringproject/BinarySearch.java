package com.in28minutes.firstspringproject.firstspringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	//BinarySearch depends on SortAlgorithm
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int BinarySearchFunc(int [] array) {
		//Perform BinarySearch here
		return sortAlgorithm.Sort(array);
	}
}
