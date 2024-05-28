

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fibonacci Series = 0,1,1,2,3,5,8...
		
		int first=0;
		int second=1;
		int num=8; // fibonacci series till this number
		
		for(int i=1;i<=num;i++) {
		System.out.println(first);
		int third = first+second;
		first =second;
		second=third;
				
		}
		
	}

}
