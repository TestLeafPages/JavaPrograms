package coding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Intersection {

	int[] arr1 = {3,2,11,4,6,7};
	int[] arr2 = {1,2,8,4,9,7};


	@Test(priority=1)
	public void intersectionBetweenArrays() throws IOException {

		List<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					arrayList.add(arr2[j]);
				}
			}
		}
		Collections.sort(arrayList);
		System.out.println("Intersection of two arrays are: "+arrayList);

	}

	@Test(priority=2)
	public void intersectionUsingSet() throws IOException {

		List<Integer> firstList = new ArrayList<Integer>(); 
		for (int i : arr1)
			firstList.add(i);
	
		List<Integer> secondList = new ArrayList<Integer>(); 
		for (int i : arr2)
			secondList.add(i);

		firstList.retainAll(secondList);
		System.out.println(firstList);
	}

}
