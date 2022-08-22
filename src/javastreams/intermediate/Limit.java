package javastreams.intermediate;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 * Demo class created to demonstrate intermediate stream operation -> limit
 * limit() --> Returns a stream consisting of the elements of the stream, 
 * truncated to be no longer than {maxSize} in length.
 */
public class Limit {

	public static void main(String[] args) {

		String[] fruitsArray = new String[] { "kiwi", "apple", "orange", "pineapple", "banana" };
		Stream<String> fruitsStream = Arrays.stream(fruitsArray);

		// limiting the no. of elements in resultant stream to 2
		fruitsStream.limit(2).forEach(System.out::println);

	}

}
