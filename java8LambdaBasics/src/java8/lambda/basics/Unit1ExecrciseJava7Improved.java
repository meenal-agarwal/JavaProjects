package java8.lambda.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExecrciseJava7Improved {
	
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
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		
	//  Step2: Create a method that prints all elements in the list
		printConditionally(people, new Condition(){
			
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return true;
			}
			
		});
		
	//  Step3: Create a method that prints all people that have last name beginning with A
		printConditionally(people, new Condition(){

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("A");
			}	
		});
	}

	public static void printConditionally(List<Person> people, Condition cond){
		for(Person p : people){
			if(cond.test(p)){ 
			System.out.println(p);
			}
		}
	}
}

interface Condition{
	boolean test(Person p);
}
