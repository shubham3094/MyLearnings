package CodePractice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArrayUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 2,5,3,7,99,12,24,12,24};
		findDuplicateUsingFor(num);
		findDuplicateUsingForeach(num);

	}

	private static void findDuplicateUsingForeach(int[] num) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i : num) {
			
			if(!set.add(i)) {
				System.out.println(i+ " is duplicate");
			}
		}
		
	}

	private static  void findDuplicateUsingFor(int[] num) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i=0;i<num.length;i++) {

			if(set.contains(num[i])){
				System.out.println(num[i]+ " is duplicate");
			}
			else {
				set.add(num[i]);
			}
		}
	}

}

