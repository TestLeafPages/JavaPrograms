package coding;

import org.testng.annotations.Test;

public class SumOfDigits extends BaseTestNg {


	int input=201,original, remainder,sumOfDigits;// Input number 

	@Test(priority=1)
	public void sum() {
		original = input;
		while(original>0)
		{
			remainder = original%10;
			sumOfDigits=sumOfDigits+remainder;
			original=original/10;
		}
		System.out.println("Sum of digits is " +sumOfDigits);
	}  
	
	@Test(priority=2)
	public void sumUsingStr() {
		String val = String.valueOf(input);
		char[] charArray = val.toCharArray();
		sumOfDigits = 0;
		for (char c : charArray) {
			sumOfDigits= sumOfDigits + Integer.parseInt(""+c);
		}
		System.out.println("Sum of digits is " +sumOfDigits);
	}  

}
