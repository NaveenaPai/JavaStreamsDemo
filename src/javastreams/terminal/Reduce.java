package javastreams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * Demo class created to demonstrate terminal stream operation -> reduce
 * reduce() -> Performs a reduction on the elements of the stream, 
 * using an associative accumulation function, and returns an 
 * Optional describing the reduced value,if any. 
 */
public class Reduce {

	public static void main(String[] args) {

		// Example 1: Implementation of reduce() to get the concatenate & get the date
		String[] strDate = new String[] { "25", "August", "2013" };
		Stream<String> dateStream = Arrays.stream(strDate);
		Optional<String> date = dateStream.reduce((a, b) -> a + " - " + b);
		if (date.isPresent())
			System.out.println("Result in date format --> " + date.get());

		// Example 2: Implementation of reduce method to find the longest string
		String[] fruitsArray = new String[] { "apple", "orange", "pineapple", "peach", "banana", "pears" };
		Stream<String> fruitsStream = Arrays.stream(fruitsArray);
		Optional<String> longestString = fruitsStream
				.reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2);
		if (!longestString.isEmpty())
			System.out.println("Fruit with longest name --> " + longestString.get());

		// Example 3: Find the product of all the numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> product = numbers.stream().reduce((a, b) -> a * b);
		if (!product.isEmpty())
			System.out.println("Product of all the numbers --> " + product.get());
	}

}
