package javastreams.terminal;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Demo class created to demonstrate terminal stream operation -> anyMatch 
 * anyMatch() -> returns true if any elements of the stream match the provided predicate else false.
 */
public class AnyMatch {

	public static void main(String[] args) {

		// Example usage 1: Check if there is any fruit ending with letter 'e'
		String[] fruitsArray = new String[] { "kiwi", "apple", "orange", "pineapple", "banana" };
		Stream<String> fruitsStream = Arrays.stream(fruitsArray);

		boolean matchFound = fruitsStream.anyMatch(s -> s.endsWith("e"));
		System.out.println(matchFound);

		// Example usage 2: Check for multiple conditions
		List<Integer> numberList = Arrays.asList(11, 32, 64, 78, 14, 2, 96);

		Predicate<Integer> condition1 = n -> n % 2 == 0;// even number
		Predicate<Integer> condition2 = n -> n > 50; // number>50

		boolean numberFound = numberList.stream().anyMatch(condition1.and(condition2));
		System.out.println(numberFound);
	}

}
