package com.amigoscode.myexamples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;

public class GettingStarted {

	public static void main(String args[]) throws IOException	{
		declarativeApproachUsingStreams();
	}
	@Test
	public static void declarativeApproachUsingStreams() throws IOException	{
		List<Person> people = MockData.getPeople();
		List<Person> youngPeople = new ArrayList<>();
/*		
		people.stream()
			.filter(p -> p.getAge() <= 18)
			.forEach(System.out::println);
*/
		youngPeople = people.stream()
			.filter(p -> p.getAge() <= 18)
			.limit(10)
			.collect(Collectors.toList());
		
//		youngPeople.forEach(System.out::println);
	}
}
