package javastreams.terminal;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Demo class created to demonstrate terminal stream operation -> noneMatch
 * noneMatch() -> returns true if all elements of the stream match the provided predicate else false.
 */
public class NoneMatch {

	public static void main(String[] args) {

		// Example 1: Check if there is none of the fruits with less than 4 letters
		String[] fruitsArray = new String[] { "apple", "orange", "pineapple" };
		Stream<String> fruitsStream = Arrays.stream(fruitsArray);

		boolean noMatchFound = fruitsStream.noneMatch(s -> s.length() < 4);
		System.out.println(noMatchFound); // should print true

		// Example 2: Check for multiple conditions
		List<Integer> numberList = Arrays.asList(52, 92, 64, 78, 96);

		Predicate<Integer> condition1 = n -> n % 2 == 0;// even number
		Predicate<Integer> condition2 = n -> n < 50; // number>50

		boolean numberFound = numberList.stream().noneMatch(condition1.and(condition2));
		System.out.println(numberFound); // should print true
	}

}
