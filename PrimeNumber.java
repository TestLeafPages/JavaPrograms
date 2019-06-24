package coding;

import org.testng.annotations.Test;

public class PrimeNumber extends BaseTestNg {
	
	int n = 170;
	
	boolean bNonPrime = false;
	@Test(priority=1)
	public void isPrime() {
		bNonPrime = false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("Non Prime");
				bNonPrime = true;
				break;
			}
		}
		if(!bNonPrime)
			System.out.println("Prime");
	}
	

}

