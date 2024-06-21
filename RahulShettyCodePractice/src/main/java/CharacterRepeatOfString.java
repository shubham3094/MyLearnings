
public class CharacterRepeatOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "shubham";
		int l =  str.length();
		String output = "";
		
		for(int i=0;i<l;i++) {
			
			output += str.substring(i,i+1) + str.substring(i,i+1);
		}
		
		System.out.println("result is : " +output);
		
	}

}
