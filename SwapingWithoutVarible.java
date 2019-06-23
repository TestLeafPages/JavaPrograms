package coding;

import org.testng.annotations.Test;

public class SwapingWithoutVarible extends BaseTestNg{
	int x = 10;
    int y = 20;
    @Test
	public void swapingWithout3rdVarible(){ 
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
    }
    @Test
	public void swapingWithoutTempVarible(){
		System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x = x*y;
        y = x/y;
        x = x/y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
	}
	@Test
	public void swapingWithout3Varible(){ 
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x = x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
    }
}







