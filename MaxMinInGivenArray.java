package coding;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class MaxMinInGivenArray extends BaseTestNg {

	Integer[] array = {1,45, 77, 88, 33, 23, 4};
	@Test
	public void usingForLoop() {
		int smallNumber =array[0];
		int largestNumber =array[0];
				for (int i = 0; i < array.length; i++) {
					if (array[i]> largestNumber ) {
						largestNumber = array[i];
					} else if (array[i]<smallNumber) {
						smallNumber = array[i];
					}
				}
				System.out.println("Maximum array of number is "+largestNumber);
				System.out.println("Minimum array of number is "+smallNumber);
	}
	@Test
	public void usingArray() {
		Arrays.sort(array);
		System.out.println("Minimum number in Array "+array[0]);
		System.out.println("Maximum number in Array "+array[array.length-1]);
	}
	@Test
	public void usingCollection() {
		Integer max = Collections.max(Arrays.asList(array));
		System.out.println("Maximum array of number is "+max);
		Integer min = Collections.min(Arrays.asList(array));
		System.out.println("Minimum array of number is "+min);
	}
	
}











