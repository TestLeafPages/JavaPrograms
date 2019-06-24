package coding;

import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SecondSmallest {

	int[] data = {3,2,11,4,6,7};

	@Test(priority=1)
	public void secondSmallestUsingArray() throws IOException {

		if (data.length < 2) { 
			System.out.println(" Invalid Input "); 
		} else {
			Arrays.sort(data); // useful it is not sorted
			System.out.println(data[1]);
		}
	}

	@Test(priority=2)
	public void secondSmallestUsingLoop() throws IOException {

		/* There should be at least two elements */
		if (data.length < 2) { 
			System.out.println(" Invalid Input "); 
		} else {

			int smallest = Integer.MAX_VALUE;
		    int secondSmallest = Integer.MAX_VALUE;
		    for (int i = 0; i < data.length; i++) {
		    if (data[i] < smallest) {
		            secondSmallest = smallest;
		            smallest = data[i];
		        } else if (data[i] < secondSmallest) {
		            secondSmallest = data[i];
		        }
		    }

		    System.out.println("The smallest element is: " + smallest + " and "+  "the second smallest element is: " + secondSmallest);
		}

	}
}
