package CodePractice;

public class ExtractFirstAndLast4CharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "www.google.com";
		
		int len = input.length();
		
		String last4 = input.substring(len-4);
		String first4 = input.substring(0,4);
		System.out.println("last 4 characters are "+last4);
		System.out.println("first 4 characters are "+first4);
		
	}

}
