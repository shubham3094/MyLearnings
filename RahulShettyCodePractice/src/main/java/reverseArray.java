
public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] s = { 'a', 'b', 'c', 'd', 'e' };
		int len = s.length;
		char[] b = new char[len];
		
	for(int i=0;i<s.length;i++) {
		b[len-1] = s[i];
		len=len-1;
	}
		
	for(int k=0;k<s.length;k++) {
		
		System.out.println(b[k]);
	}
	}

}
