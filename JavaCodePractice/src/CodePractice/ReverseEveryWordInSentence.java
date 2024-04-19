package CodePractice;

public class ReverseEveryWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sen = "My name is shubham and I am an Engineer";
		String revSen = "";
		String[] arr = sen.split(" ");

		for(int i=0;i<arr.length;i++) {

			String revWord = "";
			int len = arr[i].length()-1;
			for(int j=len;j>=0;j--) {

				revWord = revWord + arr[i].charAt(j);  

			}
			revSen = revSen + revWord+" ";

		}

		System.out.println(revSen);

	}

}
