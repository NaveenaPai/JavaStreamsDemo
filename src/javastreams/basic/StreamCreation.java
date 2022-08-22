package javastreams.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Demo class created to demonstrate stream creation in Java streams
 */
public class StreamCreation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/******* Creating a Stream with Array as source ******/
		String[] fruitsArray = new String[] { "kiwi", "apple", "orange", "pineapple" };
		Stream<String> fruitsStream1 = Arrays.stream(fruitsArray);

		/******* Creating a Stream with ArrayList as source ******/
		ArrayList<String> fruitsArrayList = new ArrayList<>();
		fruitsArrayList.add("kiwi");
		fruitsArrayList.add("apple");
		fruitsArrayList.add("orange");
		fruitsArrayList.add("pineapple");
		Stream<String> fruitsStream2 = fruitsArrayList.stream();

		/******* Creating a Stream from individual objects as source ******/
		Stream<String> fruitsStream = Stream.of("kiwi", "apple", "orange", "pineapple");

		/******* Creating Integer Stream ************/
		IntStream stream = IntStream.of(2, 3, 3, 5, 6, 6, 8);

	}

}
