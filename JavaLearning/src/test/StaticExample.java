package test;

class Example {
	int x;

	static int y;
	public void Example1(){
		Example2(5);
		y = 10;
		System.out.println("display m");
	}
	
	public static void Example2(int x){
		y =10;
		System.out.println("display n " +x);
	}
	
}

public class StaticExample{
	
	public static void main(String[] args) {
//		Example se = new Example();
//		Example se1 = new Example(10);
	}
}