

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A prime number is a number which is divisible by 1 and itself
		System.out.println(isPrime(5));
	}
	
	public static boolean isPrime(int num) {
		// Validate that the number is neither less than 1 nor equal to 1.
		// It should return false as it cannot be a prime number
		if (num <= 1)
		return false;

		// Logic to check if a number is prime or not. If its Prime, returns true else
		// return false
		for (int i = 2; i < num; i++) {
		if (num % i == 0) {
		return false;
		}
		}

		return true;

		}

}
