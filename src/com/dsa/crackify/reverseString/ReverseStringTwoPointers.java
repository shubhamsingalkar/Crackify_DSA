package com.dsa.crackify.reverseString;

public class ReverseStringTwoPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="shubham";
		
		char[] arr = str.toCharArray();
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			//exchanging values
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		System.out.println(new String(arr));

	}

}
