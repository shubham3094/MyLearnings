package CodePractice;

import java.util.HashMap;
import java.util.Map;

public class WordOccurenceInString {
	
	public static void main(String[] args) {
		
		//we will be using hashmap because key value pair would be required as word and count
		//split string and convert to array
		
		String inputString = "I am learning learning java java java programming language";
	
		Map<String,Integer> hmap = new HashMap<String,Integer>();
		Integer count = 1;
		
		String[] arr = inputString.split(" ");
		
		for (int i=0;i<arr.length;i++) {
			
			if(!hmap.containsKey(arr[i])) {
				hmap.put(arr[i], count);
			}
			else {
				hmap.put(arr[i], hmap.get(arr[i])+1);
			}
		}
	
	for(String x:hmap.keySet()) {
		
		System.out.println("The count of word "+ x+" is "+ hmap.get(x));
	
	}
	
	}

}
