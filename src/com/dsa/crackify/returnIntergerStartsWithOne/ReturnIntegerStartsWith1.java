package com.dsa.crackify.returnIntergerStartsWithOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnIntegerStartsWith1 {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> numList = Arrays.asList(1,234,145,112,342,167,117);
		
		List<String> collect = numList.stream()
				.map(n->Integer.toString(n))
				.filter(n-> n.startsWith("1"))
				.collect(Collectors.toList());
		
		//collect.forEach(System.out::println);
		System.out.println(collect);
	}

}
