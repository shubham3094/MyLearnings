package CodePractice;

public class CharacterOccurenceInString {
	
	public static void main(String aregs[]) {

	String inputString = "Java is Object Oriented langauge";
	
	int result = inputString.length()-inputString.replaceAll("a", "").length();
	
    System.out.println("occurence of character a is "+ result);
}
}