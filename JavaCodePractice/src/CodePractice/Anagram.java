package CodePractice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Anagram - no. of characters same and length same
		String s1 = "army";
		String s2 = "mary";
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("both strings are anagram");
		}
		else {
			System.out.println("both string are not anagram");
		}
	}

}
