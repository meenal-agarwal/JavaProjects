package java8.lambda.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseJava8Consumer {

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
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
	
	//  Step2: Create a method that prints all elements in the list
		System.out.println("Print all soretd Persons by last name");
		performConditionally(people, p -> true, p -> System.out.println(p));
		System.out.println("\n");
		
	//  Step3: Create a method that prints all people that have last name beginning with A
		System.out.println("Print person with last name beginning with A");
		performConditionally(people, p -> p.getLastName().startsWith("A"), p -> System.out.println(p));
		System.out.println("\n");

	//  Step4: Create a method that prints all people that have first name beginning with A
		System.out.println("Print person with first name beginning with A");
		performConditionally(people, p -> p.getFirstName().startsWith("A"), p -> System.out.println(p.getFirstName()));
	}

	public static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
		for(Person p : people){
			if(predicate.test(p)){ 
				consumer.accept(p);;
			}
		}
	}
}


	

