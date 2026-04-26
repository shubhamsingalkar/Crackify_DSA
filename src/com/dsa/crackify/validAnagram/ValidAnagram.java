package com.dsa.crackify.validAnagram;

import java.util.Arrays;

public class ValidAnagram {

	private static boolean isAnagram(String s, String t) {

		if(s.length() != t.length()) {
			return false;
		}

		int [] count = new int [26]; // Creates [0,0,0,0,0,0,0,0,0,0,0,.......]
		
		System.out.println(Arrays.toString(count));

		for(int i = 0; i<s.length(); i++) {

			int j = count[s.charAt(i) - 'a'] ++; //ASCII of 'a'=97
			int k = count[t.charAt(i) - 'a'] --;
			
			//System.out.println("j: "+j+" "+s.charAt(i));
			//System.out.println("k: "+k+" "+t.charAt(i));

		}

		System.out.println(Arrays.toString(count));
		
		for(int c :count) {
			if(c != 0) {

				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "listen";
		String t = "silent";

		boolean anagram = ValidAnagram.isAnagram(s,t);

		if(anagram) {

			System.out.println("It is valid anagram");
		}
		else {
			System.out.println("It is not valid anagram...");
		}
	}
}
