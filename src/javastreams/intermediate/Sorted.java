package javastreams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Demo class created to demonstrate intermediate stream operation -> sorted
 * sorted() -->  returns a stream consisting of the elements of this stream, 
 * sorted according to natural order.
 */
public class Sorted {

	public static void main(String[] args) {

		// Example 1: String Sorting
		String[] fruitsArray = new String[] { "kiwi", "apple", "orange", "pineapple", "banana" };
		Stream<String> fruitsStream = Arrays.stream(fruitsArray);

		// Displaying the stream content in default sort order
		System.out.println("\nAfter sorting fruits");
		fruitsStream.sorted().forEach(x->System.out.print(x+" "));

		// Example 2: Integer Sorting
		List<Integer> numberList = Arrays.asList(1, 4, 2, 3, 5, 8, 6);

		// Displaying the stream content in default sort order
		System.out.println("\n\nAfter sorting integers");
		numberList.stream().sorted().forEach(x->System.out.print(x+" "));

	}

}
