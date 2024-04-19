package CodePractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateWordFromSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input  = "i am shubham and and shubham is is am am Engineer";
		String output = " ";
		String[] arr  = input.split(" ");
		// output = i am shubham and is Engineer 
		
		//Using regular loop
		Set<String> set = new HashSet<String>();
		for(String str : arr) {

			if(set.add(str)) {

				output = output.concat(str).concat(" ");
			}
		}
		System.out.println("Updated string is : "+ output);

		//Using Iterator
		Set<String> linkedSet = new LinkedHashSet<String>();
		for(String str : arr) {
			linkedSet.add(str);
		}
		Iterator itr = linkedSet.iterator();
		while(itr.hasNext()) {
		System.out.print(itr.next() + " ");
		}
	}

}
