import java.util.HashMap;
import java.util.Map;

public class CountCharactersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "MynEwStringgggggggg";
		int count=1;
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<=ch.length-1;i++) {
			
			if(!map.containsKey(ch[i])){
				map.put(ch[i], count);
			}
			else {
				map.put(ch[i],map.get(ch[i])+1);
			}
		}
		
		System.out.println(map);
	}

}
