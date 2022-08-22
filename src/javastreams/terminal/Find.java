package javastreams.terminal;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * Demo class created to demonstrate terminal stream operation -> findAny, findFirst
 * findAny() method returns any element from a Stream, 
 * while the findFirst() method returns the first element in a Stream.
 * 
 * There might be a case where we require the first element of a filtered stream to be fetched. 
 * When the stream being worked on has a defined 
 * order(the order in which the elements of a stream are processed), 
 * then findFirst() is useful which returns the first element in a Stream.
 */
public class Find {

	public static void main(String[] args) {

		String[] fruitsArray = new String[] { "apple", "orange", "pineapple", "peach", "banana", "pears" };
		Stream<String> fruitsStream = Arrays.stream(fruitsArray);

		// findAny() - find any fruit that begins with 'p'
		Optional<String> fruit = fruitsStream.filter(s -> s.charAt(0) == 'p').findAny();
		if (fruit.isPresent())
			System.out.println("Result of findany --> " + fruit.get());

		// findFirst()
		Stream<String> fruitsStream2 = Arrays.stream(fruitsArray);
		Optional<String> pfruit = fruitsStream2.sorted().findFirst();
		if (pfruit.isPresent())
			System.out.println("Result of findfirst --> " + pfruit.get());
	}

}
