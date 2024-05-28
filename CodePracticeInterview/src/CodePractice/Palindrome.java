package CodePractice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reading from left to right or right to left , it will remain same 
		//Using recurssion
		String input = "nitin";
		boolean result = isPalindrome(input);
		System.out.println(input+" is palindrome: "+ result);
		
	}

	private static boolean isPalindrome(String input) {
		// TODO Auto-generated method stub
		if (input==null) {
			return false;
		}
		
		if(input.length()<=1) {
			return true;// since empty string or singlr char string  is a palindrome
		}
		
		String first = input.substring(0,1);
		String last = input.substring(input.length()-1,input.length());
		
		if(!first.equals(last)) {
			return false;
		}
		else {
			return isPalindrome(input.substring(1,input.length()-1));
		}
	}

}
