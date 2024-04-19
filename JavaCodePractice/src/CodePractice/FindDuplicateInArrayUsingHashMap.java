package CodePractice;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInArrayUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 2,5,3,7,99,12,24,12,24};
		int count = 1;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<num.length;i++) {
			
			if(!map.containsKey(num[i])){
				map.put(num[i], count);
			}
			else {
				map.put(num[i], map.get(num[1])+1);
			}
		}
		
		for(Integer i : map.keySet()) {
			if(map.get(i)>1) {
				System.out.println(i + " is duplicate");
			}
		}
	}

}
