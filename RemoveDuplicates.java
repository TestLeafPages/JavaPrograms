package coding;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveDuplicates extends BaseTestNg {

	int array[]= {1,3,3,3,3,5,6,6,7,7,7};
	@Test(priority=1)
	public void usingSet() {
		int n=array.length;
		Set<Integer> dupNumbers = new LinkedHashSet<Integer>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[j]==array[i]) {
					dupNumbers.add(array[i]); 
				}
			}
		}
		System.out.println(dupNumbers);
		System.out.println();
	}
	@Test(priority=2)
	public void usingArraysSort() {
		Arrays.sort(array);
		String repeatedNum = "";
		for (int i = 0; i < array.length -1 ; i++) {
			if(array[i] == array[i+1]){
				if (!repeatedNum.equals(array[i]+" ")) {
					repeatedNum = array[i] +" ";
					System.out.print(repeatedNum);
					System.out.println();
				}
			}
		}
	}
	@Test(priority=3)
	public void usingForLoop() {
        int count=0;
        for(int j=0;j<array.length;j++) {
            for(int k =j+1;k<array.length;k++) {
                if(array[j]==array[k]) {
                    count++;
                }
            }
            if(count==1)
               System.out.println(array[j]);
            count = 0;
        }
    }

}