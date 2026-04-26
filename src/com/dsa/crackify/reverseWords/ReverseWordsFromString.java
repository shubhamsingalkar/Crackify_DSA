package com.dsa.crackify.reverseWords;

public class ReverseWordsFromString {
	
	public static void main(String[] args) {
		
		String str = " I am a Java Developer";
		
		String[] words = str.split(" ");
		
		String reversed = "";
		
		for(int i = words.length - 1; i>=0 ; i--) {
			
			reversed = reversed + words[i]+" ";
		}
		
		System.out.println(reversed);
		
	}

}
