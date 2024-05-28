package CodePractice;

public class SwapNumbers {

	public static void main(String args[]) {
		
		int a = 10;
		int b = 20;
		System.out.println("Befor Swapping"+"a="+a+" and b="+b);
		swap(a,b);
		

	}
	
	public static void swap(int a, int b) {
		
		int x;
		x=a;
		a=b;
		b=x;
		System.out.println("After Swapping"+"a="+a+" and b="+b);
	}
}
