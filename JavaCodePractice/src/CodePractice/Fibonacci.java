package CodePractice;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 10;
		int first=0;
		int second=1;
		
		
		for(int i=1;i<=num;i++) {
			
			System.out.println( first+" ");
			int third = first+second;
			first=second;
			second=third;
		}
		
	}

}
