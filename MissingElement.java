package coding;

import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.Test;

public class MissingElement {

	int[] data = {3,2,1,4,6,7};

	@Test(priority=1)
	public void missingElement() throws IOException {

		int sum = 0, max = 0;
		for(int n : data){
			sum = sum+n;
			if(n > max) max = n;
		}
		System.out.println((max*(max+1)/2) - sum);

	}
	
	@Test(priority=2)
	public void missingElementAnother() throws IOException {

		Arrays.sort(data); // useful it is not sorted
		for (int i = 1; i <= data.length; i++) {
			if(i != data[i-1]) {
				System.out.println("Missing element is "+ i);
				break;
			}
		}

	}
}
