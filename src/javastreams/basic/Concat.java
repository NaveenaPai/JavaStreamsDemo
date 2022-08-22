package javastreams.basic;

import java.util.stream.Stream;

/*
 * Demo class created to demonstrate java stream concat() 
 * concat() --> method creates an output of concatenated stream  which has
 * all the elements of the first stream followed by all the elements of the second stream. 
 */
public class Concat {

	public static void main(String[] args) {

		// Create 2 different Streams
		Stream<String> fruitsStream = Stream.of("kiwi", "apple", "orange", "pineapple");
		Stream<String> VegetableStream = Stream.of("potato", "onion", "chilly", "tomato");

		// Concatenating both the streams and displaying the result using foreach
		Stream.concat(fruitsStream, VegetableStream).forEach(x -> System.out.println(x));

	}

}
