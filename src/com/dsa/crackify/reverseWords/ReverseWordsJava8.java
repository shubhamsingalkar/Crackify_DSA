package com.dsa.crackify.reverseWords;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsJava8 {
	
	public static void main(String[] args) {
		
		String str = "I am Java Developer";
		
		List<String> list = Arrays.asList(str.split(" "));
		
		Collections.reverse(list); // reverse the list
		
		String result = list.stream().collect(Collectors.joining(" ")); //Joins the list and converts into String
		
		System.out.println(result);
		
	}

}
