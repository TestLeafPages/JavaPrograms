package coding;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestNg {
	
	long startTime;
	long endTime;
	int  letter, space, num, specialChar;
	
	@BeforeMethod
	public void startTimer() {
		letter = 0;
		 space = 0; num = 0; specialChar = 0;
		startTime = System.nanoTime();
	}

	@AfterMethod
	public void endTimer() {
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
	}
}
