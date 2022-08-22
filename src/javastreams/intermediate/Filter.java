package javastreams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Demo class created to demonstrate intermediate stream operation -> filter
 * filter() -->  returns a stream consisting of the elements of that match the given predicate (condition).
 */
public class Filter {

	public static void main(String[] args) {

		// Example 1: Filtering numbers
		List<Integer> numberList = Arrays.asList(11, 32, 64, 78, 14, 2, 96);

		// Filtering the integers that are > 50
		System.out.println("\nResult after filtering integers >50");
		numberList.stream().filter(x -> x > 50).forEach(x->System.out.print(x+" "));

		// Filtering the integers that are < 50
		System.out.println("\n\nResult after filtering integers <50");
		numberList.stream().filter(x -> x < 50).forEach(x->System.out.print(x+" "));

		// Example 2: Filtering fruits that begin with 'p'
		String[] fruitsArray = new String[] { "apple", "orange", "pineapple", "peach", "banana", "pears" };
		Stream<String> fruitsStream = Arrays.stream(fruitsArray);

		System.out.println("\n\nList of fruits that begin with 'p'");
		fruitsStream.filter(a -> a.charAt(0) == 'p').forEach(x->System.out.print(x+" "));

	}

}
