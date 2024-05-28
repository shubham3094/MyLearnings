package CodePractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoElementSumEqualToRestOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,7,8,3,1};
		int sum = 0;
		Set<Integer> set = new HashSet<Integer>();

		for(int i : arr) {
			sum=sum+i;
		}

		sum=sum/2;
		for(int a : arr) {

			String temp = Integer.toString(sum-a);
			if(Arrays.toString(arr).contains(temp)) {
				System.out.println("The 2 elemetys are : "+a +" "+temp);
				break;
			}

		}
	}
}

