
public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "The rains have started here";
		String str1 = "The Rains have started Here";

		//length of string
		int len = str.length();

		// check character at 5th location
		char stringAtFifthLoc = str.charAt(5);

		// check index of s
		int indexOfS = str.indexOf("s");

		// check index of second Occurence
		int indexOfSecondS = str.indexOf('s',(str.indexOf("s"))+1);

		// index of word which is not present in String 
		int indexofhello = str.indexOf("hello");

		//string compare
		System.out.println("checking string are equal or not : "+ str.equals(str1));
		
		//string compare case sensitive
		System.out.println("checking string are equal or not : "+ str.equalsIgnoreCase(str1));

		//fetch rains frrom string
		String rains = str.substring(str.indexOf("rains"),9);
		System.out.println("Fetching rains : "+ rains);
		
		// trim
		String newString =  "  My name is shubham     ";
		System.out.println("Remove before and after space : "+ newString.trim());
		
		//remove spaces in between
		System.out.println("After removing in between spaces : "+ newString.replace(" ", "").trim());
		
		
		System.out.println("length of string is : " + len);
		System.out.println("character at 5th index is : " + stringAtFifthLoc);
		System.out.println("index of s character is : " + indexOfS);
		System.out.println("index of second occurence of s character is : " + indexOfSecondS);
		System.out.println("index of hello : " + indexofhello);

	}

}
