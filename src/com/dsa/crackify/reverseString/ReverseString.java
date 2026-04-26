package com.dsa.crackify.reverseString;

public class ReverseString {
	
	
	public static String rString(String str) {
		
		String ss = "";
		
		if(str.isBlank()) {
			return null;
		}
		
		for (int i = str.length()-1; i>=0; i--) {
			
		char cc = str.charAt(i);
		
		ss = ss+cc;
		
		}
		
		return ss;
	}
	
	public static void main(String[] args) {
		
		String rString = ReverseString.rString("Hello");
			
		System.out.println(rString);
	}

}
