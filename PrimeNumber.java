package coding;

public class PrimeNumber extends BaseTestNg {
	static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	//priority=1
	public static void main(String[] args) {
		boolean prime = isPrime(17);
		System.out.println(prime);
		findingPrime();
	}
	//(priority=2)
	public static void findingPrime() {
		int num = 17, count;

		for (int i = 1; i <= num; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}

		}
	}

}

