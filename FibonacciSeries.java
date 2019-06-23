package coding;

import org.testng.annotations.Test;

public class FibonacciSeries extends BaseTestNg {

	@Test(priority=1)
	public void Series() {
		int n1=0,n2=1,n3,i,count=20; 
		//printing 0 and 1
		System.out.print(n1+" "+n2);    
		//loop starts from 2 because 0 and 1 are already printed
		for(i=2;i<count;++i)    
		{
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;  
			System.out.println();
		}    
	}
	@Test(priority=2)
	public void fibonacciSeries() {
		int i = 1, n = 10, t1 = 0, t2 = 1;
		System.out.print("First " + n + " numbers series: ");	
		while (i <= n)
		{
			System.out.println(t1 + " ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			i++;
		}
	}
	
}
