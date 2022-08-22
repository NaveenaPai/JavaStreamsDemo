package javastreams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Demo class created to demonstrate terminal stream operation -> collect
 * collect() ->  used to accumulate elements of any Stream into a Collection.
 */
public class Collect {

	public static void main(String[] args) {

		// Example 1: Implementation of sort and collect
		String[] fruitsArray = new String[] { "apple", "orange", "pineapple", "peach", "banana", "pears" };
		Stream<String> fruitsStream = Arrays.stream(fruitsArray);
		System.out.println("\nList of fruits in order");
		List<String> sortedfruits = fruitsStream.sorted().collect(Collectors.toList());
		for (String fruit : sortedfruits)
			System.out.println(fruit);

		// Example 2: Implementation of sort and collect
		Stream<String> fruitsStream2 = Arrays.stream(fruitsArray);
		System.out.println("\nList of fruits beginning with letter p");
		List<String> filteredfruits = fruitsStream2.filter(a -> a.charAt(0) == 'p').collect(Collectors.toList());
		for (String fruit : filteredfruits)
			System.out.println(fruit);

		// Example 3: Implementation of filter and collect with numbers
		List<Integer> numbers = Arrays.asList(70, 42, 20, 36, 45, 50);
		// filter (multiples of 5)
		List<Integer> result = numbers.stream().filter(num -> num % 5 == 0).collect(Collectors.toList());
		System.out.println("\nList of numbers that are multiples of 5");
		for (int num : result)
			System.out.println(num);
	}

}
