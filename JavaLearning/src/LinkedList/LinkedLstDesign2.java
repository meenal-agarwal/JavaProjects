package LinkedList;

class Node1 {
	public int data;
	public Node1 next;
	private static final Node1 Null = null;
	

	Node1(int a) {
		data = a;
		next = Null;
	}
	
}

public class LinkedLstDesign2 {

	public static void main(String[] args) {
		Node1 head;
		Node1 nd1 = new Node1(10);
		head = nd1;
		Node1 nd2 = new Node1(20);
		nd2.next = nd1;
		head = nd2;
		Node1 nd3 = new Node1(20);
		nd3.next = nd2;
		head = nd3;
		Node1 nd4 = new Node1(20);
		nd4.next = nd3;
		head = nd4;
		
	}

}
