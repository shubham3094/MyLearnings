package CodePractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.*;

public class FindFirstNonRepeastedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "swiss";
		Integer count  = 1;
		char[] arr = inputString.toCharArray();
		//LinkedHashMap maintains the insertion order
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				
				map.put(arr[i], count);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		//Traversing Map using Entry
		for (Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()==1) {
				System.out.println("First non repeasted character is "+ entry.getKey());
				break;
			}
		}
	}

}
