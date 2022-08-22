package javastreams.intermediate;

import java.util.Arrays;
import java.util.List;

/*
 * Demo class created to demonstrate intermediate stream operation -> distinct
 * Distinct() --> returns a stream consisting of distinct elements in a stream.
 */
public class Distinct {

	public static void main(String[] args) {

		//Example 1: Find distinct numbers
		
		// Creating integer list with duplicate values
		List<Integer> numberList = Arrays.asList(1, 4, 2, 3, 1, 4, 5, 6, 3);
		
		numberList.stream().distinct().forEach(System.out::println);
		
	}

}
