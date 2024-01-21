package com.amigoscode.myexamples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.amigoscode.beans.Car;
import com.amigoscode.mockdata.MockData;

public class Filtering {
	
	public static void main(String args[]) throws Exception	{
		takeWhile();
	}

//	1. Filtering car with price < 20K, and color "Yellow"
	public void filter() throws Exception	{
		
		System.out.println("Q1. Filtering car with price < 20K, and color \"Yellow\" \n");
		List<Car> cars = MockData.getCars();
		
		cars.stream()
			.filter(car -> car.getPrice() < 20_000.00)
			.filter(car -> car.getColor().equals("Yellow"))
			.forEach(System.out::println);
	}
	
//	2. Drop Even number values from the Array
	@Test
	public void dropWhile() throws Exception	{
		
		System.out.println("Q2. Drop Even number values from the Array \n");
		Stream.of(2, 4, 6, 8, 9, 10, 12)
			.dropWhile(n -> n % 2 == 0)
			.collect(Collectors.toList())
			.forEach(n -> System.out.print(n + " "));
	}
	
	@Test
	public static void takeWhile() throws Exception	{
		System.out.println("Q3. Keep Even number values from the Array \n");
		
		Stream.of(2, 4, 6, 8, 9, 10, 12)
			.takeWhile(n -> n % 2 == 0)
			.collect(Collectors.toList())
			.forEach(n -> System.out.print(n + " "));
	}
}
