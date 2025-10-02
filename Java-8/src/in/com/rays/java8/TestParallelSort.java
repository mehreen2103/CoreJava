package in.com.rays.java8;

import java.util.Arrays;
import java.util.Comparator;

public class TestParallelSort {

	public static void main(String[] args) {
		int [] a = {5, 4, 3, 2, 1};
		
		Arrays.parallelSort(a);
		
		for(int b: a) {
			System.out.println(b);
		}
		
		System.out.println("--------");
		
		//reverse sort with integer[] (not int[])
		
		Integer[] i = {5, 4, 3, 2, 1};
		
		Arrays.parallelSort(i, Comparator.reverseOrder());
		
		for(int x : i) {
			
			System.out.println(x);
		}
	}
}
