
public class SumOfGivenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//694: 6+9+4=19
		int num=856;
		int sum=0;
				
				while(num!=0) {
					int rem = num % 10;
					sum += rem;
					num = num/10;
					
				}
		System.out.println("sum of integer is = "+sum);
		
	}

}
