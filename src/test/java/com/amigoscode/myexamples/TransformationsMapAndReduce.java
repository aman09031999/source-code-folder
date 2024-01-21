package com.amigoscode.myexamples;

import java.util.List;
import java.util.stream.Collectors;

import com.amigoscode.beans.Person;
import com.amigoscode.beans.PersonDTO;
import com.amigoscode.mockdata.MockData;

public class TransformationsMapAndReduce {

	public static void main(String args[]) throws Exception	{
		yourFirstTransformation();
	}

	public static void yourFirstTransformation() throws Exception	{
		List<Person> people = MockData.getPeople();
		List<PersonDTO> dtos = people.stream()
									.filter(p -> p.getAge() > 20)
									.map(person -> new PersonDTO(person.getId(),
																person.getFirstName(),
																person.getAge())
									)
									.collect(Collectors.toList());
		
	//	dtos.forEach(System.out::println);
		
		System.out.println(people.size() == dtos.size());
	}
}
