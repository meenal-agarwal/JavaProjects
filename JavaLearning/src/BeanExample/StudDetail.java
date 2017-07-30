package BeanExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudDetail {
	
	public int numOfStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many students you want to register?  ");
		int num = sc.nextInt();
		return num;
	}

	public static void main(String[] args) {
		StudDetail sd = new StudDetail();
		int n = sd.numOfStudent();
		int x = 0;
		Student obj[] = new Student[(n)];

		while (x < n) {
			
			obj[x] = new Student();
			System.out.print("Name: ");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			obj[x].setName(name);
			obj[x].getName();

			System.out.print("Age: ");
			Scanner sc1 = new Scanner(System.in);
			int age = sc.nextInt();
			obj[x].setAge(age);
			obj[x].getAge();
			
			System.out.print("Biology or Maths: ");
			Scanner sc2 = new Scanner(System.in);
			String subject = sc2.nextLine();
			List<String> lst = new ArrayList<>();
			lst.add("Physics");
			lst.add("Chemistry");
			lst.add(subject);
			obj[x].setSubjects(lst);
			obj[x].getSubjects();
			x++;
		}
	}

}
