package CodePractice;

import java.util.HashSet;
import java.util.Set;

public class NumberSumEqualToTwoElementsSumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,7,9,12};
		int num = 11;

		checkNumSumEqual(arr,num);
	}

	private static void checkNumSumEqual(int[] arr, int num) {
		// TODO Auto-generated method stub

		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr) {
			int var = num - i;
			if(!set.contains(var)) {
				set.add(i);
			}
			else
			{
				System.out.println("Two elements whose sum is equal to number passed are : "+var+" and "+i);
			}
		}
	}

}
