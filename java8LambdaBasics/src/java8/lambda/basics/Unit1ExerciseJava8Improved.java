package java8.lambda.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseJava8Improved {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Proxy","Gupta",18),
				new Person("Anuja","Arora",20),
				new Person("Versha","Yadav",25),
				new Person("Prerna","Agarwal",25),
				new Person("Roshni","Khetan",25),
				new Person("Aayushi","Jain",18),
				new Person("Lucky","Chaudhary",18));
		
	//	Step1: Sort list by last name
		Collections.sort(people, (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
	
	//  Step2: Create a method that prints all elements in the list
		printConditionally(people, p -> true);
		
	//  Step3: Create a method that prints all people that have last name beginning with A
		printConditionally(people, p -> p.getLastName().startsWith("A"));
	
	//  Step4: Create a method that prints all people that have first name beginning with A
		printConditionally(people, p -> p.getFirstName().startsWith("A"));
	}

	public static void printConditionally(List<Person> people, Predicate<Person> predicate){
		for(Person p : people){
			if(predicate.test(p)){ 
			System.out.println(p);
			}
		}
	}
}


	

