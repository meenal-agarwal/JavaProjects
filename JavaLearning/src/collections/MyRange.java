package collections;

import java.util.HashMap;
import java.util.Scanner;

public class MyRange {

	HashMap<Integer, Integer> range;
	
	MyRange() {
		range = new HashMap<>();
	}

	public void range(int age){
		int a = age/5;
		if(!(range.containsKey(a))){
			range.put(a,1);
//			return 1;
		}
		else{
			int res = range.get((a));
			res = res+1;
			range.put(a,res);
//			return res;
		}
		
	}
	
	public static void main(String[] args) {
		MyRange mr = new MyRange();
		while(true){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		mr.range(a);
		System.out.println("No of People for key : " + a/5 + " - " + mr.range.get(a/5));
		}
	}
}
