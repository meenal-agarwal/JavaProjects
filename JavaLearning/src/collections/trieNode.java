package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Node {

	HashMap<Character, Node> node;
	int count;
//	HashMap<Character, ArrayList<Node>> newnod; 

	Node() {
		node = new HashMap<>();
		count = 0;
	}
}

public class trieNode {

	public void add(Node root, String str) {
		Node temp = root;
		int i = 0;
		while (i < str.length()) {
			if (temp.node.containsKey(str.charAt(i))) {
				temp.count = temp.count+ 1;
				temp = temp.node.get(str.charAt(i));
				
			} else {
				Node n = new Node();
				temp.node.put(str.charAt(i), n);
				temp.count = temp.count +1;
				temp = n;
			}
			i++;
		}
	}

	 public boolean isPresent(Node root, String str){
	
			Node temp = root;
			int i = 0;
			while (i < str.length()) {
				if (temp.node.containsKey(str.charAt(i))) {
					Node m = temp.node.get(str.charAt(i));
					temp = m;
					i++;
				}else{
					break;
				}
				
			} 
			if(i==str.length()){
				return true;
			}
	    return false;
	 }
	 
//	 public int prefix(String pre,Node root){
//		 
//			Node temp = root;
//			int i = 0;
//			while (i < pre.length()) {
//				if (temp.node.containsKey(pre.charAt(i))) {
//					Node m = temp.node.get(pre.charAt(i));
//					temp = m;
//					i++;
//				}
//			}
//	 }

	public static void main(String[] args) {
		
		Node root = new Node();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter String: ");
			String x = sc.nextLine();
			trieNode rit = new trieNode();
			
			System.out.println(rit.isPresent(root, x));
			
			if(!(rit.isPresent(root, x))){
				rit.add(root,x);
				System.out.println(root.count);
			}
		}
	}
}