

public class CountNumOfCharsInStringHavingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "My name is shubhama and i am an engineer";
		int len = str.length();
		
		String[] arr = str.split(" ");
		int sizeOfArray = arr.length;
		
		int Count = len-(sizeOfArray-1);
		System.out.println("number of characters in string : "+Count);
	}

}
