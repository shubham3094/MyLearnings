package CodePractice;

public class MissingNumberFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {1,2,3,5,6,7,8,9,10};
		
		int sum=0;
		int expectedSum = 0;
		for(int i=0;i<num.length;i++) {
			
			sum = sum+num[i];
		}
		
		for(int i=1;i<=10;i++) {
			expectedSum = expectedSum+i;
		}
		
		System.out.println(" The sum of given integer array is : "+sum);
		System.out.println(" The sum of expected integer array is : "+expectedSum);
		System.out.println(" The missing number is : "+(expectedSum-sum));
	}

}
