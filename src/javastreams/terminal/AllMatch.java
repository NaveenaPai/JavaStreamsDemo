package javastreams.terminal;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Demo class created to demonstrate terminal stream operation -> allMatch
 * allMatch() -> returns true if all elements of the stream match the provided predicate else false.
 */
public class AllMatch {

	public static void main(String[] args) {

		// Check if there is all fruits end with letter 'e'
		String[] fruitsArray = new String[] { "apple", "orange", "pineapple" };
		Stream<String> fruitsStream = Arrays.stream(fruitsArray);

		boolean matchFound = fruitsStream.allMatch(s -> s.endsWith("e"));
		System.out.println(matchFound);

		// Check for multiple conditions
		List<Integer> numberList = Arrays.asList(52, 92, 64, 78, 96);

		Predicate<Integer> condition1 = n -> n % 2 == 0;// even number
		Predicate<Integer> condition2 = n -> n > 50; // number>50

		boolean numberFound = numberList.stream().allMatch(condition1.and(condition2));
		System.out.println(numberFound);

	}

}
