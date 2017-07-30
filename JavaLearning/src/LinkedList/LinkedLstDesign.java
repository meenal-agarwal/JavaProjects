package LinkedList;

import java.util.Scanner;

class Node2 {
	public int data;
	public Node2 next;
	private static final Node2 Null = null;
	public Node2 Head;

	Node2(int a) {
		data = a;
		next = Null;
	}
	
	public String toString(){
		return data+"";
	}
}

public class LinkedLstDesign {

	public static void main(String[] args) {
		int n = 0;
		Node2 nd[] = new Node2[10];
		
		while (n < 3) {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			nd[n] = new Node2(x);
			if(n!=0)
				nd[n].next = nd[n-1];
//			System.out.println(nd[n].data);
			n++;
			sc.close();
		}
		
		for(Node2 x : nd){
			if(x!=null)
			System.out.println(x);
	}
		
	}

}
