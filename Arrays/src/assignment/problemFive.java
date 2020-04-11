package assignment;

import java.util.*;
import java.io.*;

public class problemFive {

	public static void main(String[] args) {

		int[] array_nums = { 2013, 2015, 1621, 2019, 2012 };

		System.out.println("leap years: ");
		for (int i = 0; i <= array_nums.length - 1; i++) {

			if ((array_nums[i] % 4 == 0) && (array_nums[i] % 100 != 0) || (array_nums[i] % 400 == 0))

				System.out.println(array_nums[i]);

		}

	}
}