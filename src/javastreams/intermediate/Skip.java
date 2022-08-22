package javastreams.intermediate;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 * Demo class created to demonstrate intermediate stream operation -> skip
 * skip() --> This method takes one long (N) as an argument 
 * and returns a stream after removing first N elements
 */

public class Skip {

	public static void main(String[] args) {

		String[] fruitsArray = new String[] { "kiwi", "apple", "orange", "pineapple", "banana" };
		Stream<String> fruitsStream = Arrays.stream(fruitsArray);

		// Printing the stream after skipping first 3 elements
		fruitsStream.skip(3).forEach(System.out::println);

	}

}
