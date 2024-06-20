import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HighestValueInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("shubham", 100);
		map.put("Rajeev", 200);
		map.put("Mohit", 300);
		map.put("Neeraj", 400);
		
		int maxValue = Collections.max(map.values());
		
		for(Entry<String, Integer> mapp : map.entrySet() ) {
			
			if(mapp.getValue() == maxValue) {
				System.out.println("The maximum salary of "+mapp.getKey()+" is"+mapp.getValue());
			}
		}
		
	}

}
