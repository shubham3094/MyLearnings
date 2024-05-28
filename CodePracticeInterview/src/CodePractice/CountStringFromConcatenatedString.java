package CodePractice;

import java.util.HashSet;

public class CountStringFromConcatenatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input  = "my name is shubhamsinghal and shubhamsharma but my actual name is shubham isshubhshubhamis isshubham";
		int count = 0;
		String[] arr = input.split(" ");
		
		for(String str : arr) {
			
			if(str.contains("shubham")) {
			count = count + 1;
			}
		}
		
		System.out.println("count of shubham is : " + count);
		
	}

}
