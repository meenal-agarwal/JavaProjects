package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArraysAsList_Example {
	
	public static void main(String[] args) {
		
		/*
		 * adding elements in Hash set
		 */
		Set<String> hash_set = new HashSet<String>();
		hash_set.add("Learning");
		hash_set.add("Basics");
		hash_set.add("Java");
		hash_set.add("Attentively");
		
		System.out.println(hash_set);
		
		/*
		 * Display elements in Tree set
		 */
		Set<String> tree_set = new TreeSet<String>(hash_set);
		System.out.println(tree_set);
		
		/*
		 * Using Arrays.asList
		 */
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[]{0,1,4,7,2,1,8}));
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[]{3,1,4,9,2,1,8,9}));
		
		System.out.println("\n"+Arrays.asList(new Integer[]{0,1,4,7,2,1,8}));
		System.out.println("asas ->"+Arrays.asList(new Integer[]{3,1,4,9,2,1,8,9}));
		
		System.out.println("\n"+set1);
		System.out.println(set2);
		
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		
		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		
		System.out.println("\n"+union);
		System.out.println(intersection);
		System.out.println(difference);
	}

}
