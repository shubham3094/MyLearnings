package CodePractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "java";
		String reversedString="";
		/*
		 * // #1 Using String Buffer Class
		 * 
		 * StringBuffer stringBuf = new StringBuffer(input); stringBuf.reverse();
		 * 
		 * System.out.println("Reversed String is "+ stringBuf.toString());
		 */
		
		
		// #2 Without using reverse method of String Buffer
	
		
		for(int i=input.length()-1;i>=0;i--) {
			
			reversedString = reversedString+ input.charAt(i);
			
		}
		System.out.println(reversedString);
	}

}
