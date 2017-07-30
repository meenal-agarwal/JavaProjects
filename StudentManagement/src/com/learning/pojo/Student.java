package com.learning.pojo;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private int age;
	public static final int grade = 12;
	private List<String> subjects;

	public Student() {
		subjects = new ArrayList<>();
	}
	
	public Student(String name, int age, List<String> subjects){
		this.name = name;
		this.age = age;
		this.subjects = subjects;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public String toString(){
		return "Name: "+getName()+", Age: "+getAge()+", Subjects: "+getSubjects()+", Grade: "+grade;
	}
}
