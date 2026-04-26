package com.dsa.crackify.reverseString;

public class ReverseStringJava8 {
	
	public static void main(String[] args) {
		
		
		String str = "Shubham";
		
		String reversed = str.chars().mapToObj(c-> (char) c)
		.reduce("", (a,b)->b+a, (a,b)-> b+a);  // "" --> empty string, b+a --> reverse string
		
		System.out.println(reversed);
	}

}
