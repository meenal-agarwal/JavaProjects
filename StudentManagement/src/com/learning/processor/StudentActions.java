package com.learning.processor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.learning.pojo.Student;

public class StudentActions {


	List<Student> studentList = null;
	
	public StudentActions(){
		this.studentList = new ArrayList<>();
	}
	
	
	public void populateStudDetail() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/meenal/Downloads/StudentInfo.txt"));
		String str = null;
		while ((str = br.readLine()) != null) {
			String studentData[] = str.split(";");
			String name = studentData[0];
			int age = Integer.parseInt(studentData[1]);
			List<String> subjects = Arrays.asList(studentData[2].split(","));
			Student stud = new Student(name, age, subjects);
			studentList.add(stud);
		}
		br.close();
	}
	
	
	public void displayAllStudents() {
		for(Student student : studentList){
			System.out.println("Name: "+student.getName()+", Age: "+student.getAge()+", Subjects: "+student.getSubjects()+", Grade: "+Student.grade);
		}
		
	}
	
	public void displayAllStudents_Version2(){
		for(Student student : studentList){
			System.out.println(student);
		}
	}
	
	
	public void sortByName(){
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for(Student student : studentList){
			System.out.println(student);
		}	
	}
	
	
	public void sortByAge(){
		studentList.sort(Comparator.comparingInt(Student :: getAge));
//		Collections.sort(studentList, Collections.reverseOrder());
		for(Student student : studentList){
			System.out.println(student);
		}	
	}
	
	
	public static void main(String[] args) throws IOException {
		StudentActions actions = new StudentActions();
		actions.populateStudDetail();
		actions.sortByAge();
	}

}
