

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacterFromString {

	public static void main(String aregs[]) {

		String inputString= "MyNameIsShubham";
		Integer count =1;
		Map<Character,Integer> hmap= new HashMap<Character,Integer>();
		char[] arr = inputString.toCharArray();

		for(int i=0;i<arr.length;i++) {
			if(!hmap.containsKey(arr[i])) {

				hmap.put(arr[i], count);
			}
			else {
				hmap.put(arr[i], hmap.get(arr[i])+1);
			}

		}
		
		for (Character x : hmap.keySet()) {
			
			if(hmap.get(x)>1) {
				System.out.println("character "+x+" is duplicate");
			}
		}
	}
}
