import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateWordsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = {"java","shubham","is","learnng","java","is"};
	Set<String> set =  new HashSet<String>();
	Map<String,Integer> map = new HashMap<String,Integer>();
	int count = 1;
	
	for( String s : strArray){
	    
	    if(set.add(s)){
	        map.put(s,count);
	    }
	    else{
	        map.put(s,(map.get(s))+1);
	    }
	}
	
	//System.out.println(map);
	
	for(String str : map.keySet()) {
       if(map.get(str)>1) {
       System.out.println("The duplicate word is : "+ str);
       }}

}}
