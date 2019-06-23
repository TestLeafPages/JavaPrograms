package coding;

import org.testng.annotations.Test;

public class PrintingTriangle extends BaseTestNg {
	@Test(priority=1)
	public  void printingStar() {
		int i, j;
		int n = 4;
		// outer loop to handle number of rows
		//  n in this case
		for(i=0; i<n; i++){
			//  inner loop to handle number of columns
			//  values changing acc. to outer loop  
			for(j=0; j<=i; j++){
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();
		}
	}
	@Test(priority=2)
	public  void printNumber() {
		int num;
		int n=5;
		for (int i = 0; i < n; i++) {
			num =1;
			for (int j = 0; j <=i; j++) {
				System.out.println(num+ " ");
				num++;
			}
			System.out.println();
		}
	}
}

