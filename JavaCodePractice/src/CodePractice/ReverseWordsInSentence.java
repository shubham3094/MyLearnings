package CodePractice;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sen = "My name is shubham and I am an Engineer";
		String reversedSen = " ";
		String[] str = sen.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			
			reversedSen = reversedSen+str[i]+" ";
		}
		
		System.out.println("reveresed string is:  "+reversedSen);
	}

}
