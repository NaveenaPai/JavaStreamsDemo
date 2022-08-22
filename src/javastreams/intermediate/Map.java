package javastreams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Demo class created to demonstrate intermediate stream operation -> map
 * map() --> returns a stream consisting of the results of 
 * applying the given function to the elements of this stream.
 */
public class Map {

	public static void main(String[] args) {

		// Example 1: Mapping to convert to uppercase
		String[] fruitsArray = new String[] { "kiwi", "apple", "orange", "pineapple", "banana" };
		Stream<String> fruitsStream = Arrays.stream(fruitsArray);

		System.out.println("\nAfter mapping to upper case: ");
		fruitsStream.map(x -> x.toUpperCase()).forEach(x->System.out.print(x+" "));

		// Example 2: Mapping numbers to their doubles
		List<Integer> numberList = Arrays.asList(11, 32, 64, 78, 14, 2, 96);
		
		System.out.println("\n\nAfter mapping numbers to their doubles: ");
		numberList.stream().map(x -> x * 2).forEach(x->System.out.print(x+" "));

	}

}