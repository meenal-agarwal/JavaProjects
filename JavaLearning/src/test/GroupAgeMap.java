package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GroupAgeMap {

	Map<String, Integer> stud;

	GroupAgeMap(){
		this.stud = new HashMap<>();
	}

	public void initialize(){
		stud.put("Animesh", 10);
		stud.put("Manoj", 11);
		stud.put("Manish", 18);
		stud.put("Ritu", 18);
		stud.put("rina", 18);
		stud.put("rajat", 10);
		stud.put("bobby", 11);
	}

	public void printMap(){
		System.out.println("Given Map is: "+stud);
	}
	
	public Map<Integer,List<String>> resultMap(){
		Map<Integer,List<String>> resMap = new HashMap<>();
		
//		Set<Integer> val = new HashSet<>(stud.values());
//		
//		for(Integer i : val){
//			List<String> al = new ArrayList<>();
//			for(String name : stud.keySet()){
//				if(stud.get(name) == i)
//				al.add(name);
//			}
//		resMap.put(i, al);
//		}
		
		
		for(String key : stud.keySet()){
			int age = stud.get(key);  
			List<String> al  = null; //discuss	
			if(resMap.containsKey(age)){
				al = resMap.get(age);		
			}else {
				al = new ArrayList<>();
			}
			al.add(key); 
			resMap.put(age, al); //repeat
 				 
		}
		return resMap;
	}
	
	
	public Map<String,Integer> getSortedMap(){
		Map<String,Integer> map = new TreeMap<> (stud);
		return map;
	}

	public static void main(String[] args) {
		GroupAgeMap grp = new GroupAgeMap();
		grp.initialize();
		grp.printMap();
		System.out.println("Result Map: "+grp.resultMap());
		System.out.println("Sorted map on keys: "+grp.getSortedMap());
	}

}