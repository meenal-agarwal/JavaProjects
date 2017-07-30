package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChkEvnOdd {

	static List<Integer> l;
	
	public ChkEvnOdd(List<Integer> l) {
		ChkEvnOdd.l = l;
		l = new ArrayList<Integer> ();
		for(int i=0; i<=10; i++){
			l.add(i);
		}
	}
	
	public static void printEven(EvnOdd ed){
		System.out.println(ed.CheckCond(l));
	}
	
	public static void main(String[] args) {
		
		
//		EvnOdd eod = l -> {
//			for(Integer i : l){
//				if(i % 2 == 0){
//					 i;
//				}
//			}
//		};
		//printEven(eod);
		
		
//		List<Integer> evenList = l.stream().filter(i -> (i%2==0)).collect(Collectors.toList());
		
	}

	interface EvnOdd{
		int CheckCond(List<Integer> l);
	}
}
