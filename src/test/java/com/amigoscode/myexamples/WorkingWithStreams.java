package com.amigoscode.myexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class WorkingWithStreams {

	@Test
	void streams()
	{
		List<String> names = List.of("Amigoscode",
									"Alex",
									"Zara");
		
		Stream<String> stream = names.stream();
		
		Stream<String> nameStream = Stream.of("Amigoscode",
											"Alex",
											"Zara");
		
		List<Object> collect = stream.limit(2)
									.map(null)
									.sorted(null)
									.dropWhile(null)
									.collect(Collectors.toList());
		
		long count = stream.limit(2)
				.map(null)
				.sorted(null)
				.dropWhile(null)
				.count();
		
		String[] namesArray = {};
		
		Arrays.stream(namesArray);

	}
}
