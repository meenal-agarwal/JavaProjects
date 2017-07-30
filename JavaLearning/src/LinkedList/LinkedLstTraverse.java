package LinkedList;

class Node3{
	public int data;
	public Node3 next;
	private static final Node3 Null = null;
	private Node3 Head;
	
	Node3(int a){
		data = a;
		next = Null;
	}
	
	public int traverseList(Node3 head){
		Node3 temp;
		int count = 0;
		temp = head;
		while(temp != Null){
			count++;
			temp = next;
		}
		return count;
		
		
	}
}

public class LinkedLstTraverse {
	
	public static void main(String[] args) {
		Node3 head;
		Node3 nd1 = new Node3(10);
		head = nd1;
		Node3 nd2 = new Node3(20);
		nd2.next = nd1;
		head = nd2;
		Node3 nd3 = new Node3(20);
		nd3.next = nd2;
		head = nd3;
		Node3 nd4 = new Node3(20);
		nd4.next = nd3;
		head = nd4;
		
		System.out.println(nd4.traverseList(head));
	}

}
