package CodePractice;

public class LargestAndSmallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,7,8,2,50,99,0,12};
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				largest = arr[i];
			}
			else if(arr[i] <smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("The samallest integer is" + smallest);
		System.out.println("The largest integer is" + largest);
	}

}
