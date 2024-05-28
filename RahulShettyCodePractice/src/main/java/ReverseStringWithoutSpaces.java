

public abstract class ReverseStringWithoutSpaces {

 public static void main(String args[]) {
	 
	 String stringToBeReversed = "MyFirstExamplle";
	 String reversedString=" ";
	 char[] arr1 = stringToBeReversed.toCharArray();
	 
	 
	 for(int i=arr1.length-1;i>=0;i--) {
		 
		 //reversedString = reversedString+arr1[i];        -------- Using chgaracter array
		  reversedString = reversedString+stringToBeReversed.charAt(i);
	 }
	 
	 System.out.println("Reversed string is :  "+reversedString);
 }
}
