package assignment;

import java.util.*;
import java.io.*;

public class problemFour {

	public static void main(String[] args) {
		
		int[] array_nums = { 11, 11, 23, 28, 28, 30, 31, 35, 70, 71 };
		
		//System.out.println("Original Array: " + Arrays.toString(array_nums));
		
		int result = 1;
		int count = 0;
		
		for (int i = 0; i <= array_nums.length-2; i++) {
			
			if (array_nums[i] == array_nums[i + 1])
				
				count++;
			
			result = 0;
		}

		if (result == 1) {
			
			System.out.println(String.valueOf(false));
			
		} else {
			
			System.out.println(String.valueOf(count));
		}
		System.out.println("\n");
	}
}
