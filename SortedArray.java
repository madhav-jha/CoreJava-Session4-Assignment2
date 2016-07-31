package session4.assignment2;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
		
		double[] arr = {6, 3.5, 90, 32.9, 23, 87, 1.3};
		System.out.println("unsorted array is:");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		Arrays.sort(arr);
		System.out.println("\nsorted array is:");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		

	}

}
