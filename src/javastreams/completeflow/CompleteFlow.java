package javastreams.completeflow;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Demo class created to demonstrate a complete end to end flow  
 */
public class CompleteFlow {

	public static void main(String[] args) {

		// Creating integer list
		List<Integer> numberList = Arrays.asList(23, 45, 2, 79, 81, 45, 90, 16, 23, 84, 36, 53);

		//Applying different stream operations
		List<Integer> result = numberList.stream()
											.distinct()
											.filter(num -> num % 2 == 0)
											.sorted()
											.skip(2)
											.collect(Collectors.toList());
		
		System.out.println("\nList of numbers after applying the series of operations: ");
		
		//Printing the results
		for (int num : result)
			System.out.print(num + " ");

	}

}
