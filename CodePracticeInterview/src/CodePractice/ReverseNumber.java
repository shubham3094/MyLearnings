package CodePractice;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("0");
		System.out.print(reverseNum(1230));

	}
	
	public static int reverseNum(int num) {
		
		int result = 0;
		
		while(num>0) {
			
		result = result*10 + num%10;
		num = num/10;
		}
		
		return result;
	}

}
