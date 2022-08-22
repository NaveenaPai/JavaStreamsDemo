package javastreams.terminal;

import java.util.Arrays;
import java.util.List;

/*
 * Demo class created to demonstrate different aggregate terminal stream operations 
 * min() -> returns the minimum element of the stream based on the provided Comparator.
 * max() -> returns the maximum element of the stream based on the provided Comparator.
 * count() -> returns the count of elements in the stream.
 */
public class AggregateFunctions {

	public static void main(String[] args) {

		// Creating integer list with duplicate values
		List<Integer> numberList = Arrays.asList(115, 94, 22, 63, 41, 14, 5, 36, 73, 94, 41);

		/********** Terminal Operation --> min() ************/

		// Using Lamda Expression: Displaying the minimum element in the stream
		int minValue = numberList.stream().min((a, b) -> a.compareTo(b)).get();
		System.out.println("Minimal value from the list of elements -->" + minValue);

		// Using Integer Compare function: Displaying the minimum element in the stream
		int minVal = numberList.stream().min(Integer::compare).get();
		System.out.println("Minimal value from the list of elements -->" + minVal);

		/********** Terminal Operation --> max() ************/

		// Using Lamda Expression: Displaying the maximum element in the stream
		int maxValue = numberList.stream().max((a, b) -> a.compareTo(b)).get();
		System.out.println("Max value from the list of elements -->" + maxValue);

		// Using Integer Compare function: Displaying the maximum element in the stream
		int maxVal = numberList.stream().max(Integer::compare).get();
		System.out.println("Max value from the list of elements -->" + maxVal);

		/********** Terminal Operation --> count() ************/

		long count = numberList.stream().count();
		System.out.println("Number of elements in the stream  -->" + count);

		long distinctCount = numberList.stream().distinct().count();
		System.out.println("Number of distinct elements in the stream  -->" + distinctCount);
	}

}
