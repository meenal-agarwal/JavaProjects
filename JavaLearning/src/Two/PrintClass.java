package Two;

public class PrintClass {

	
	public void printSomething(){
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		PrintClass pc = new PrintClass();
		pc.printSomething();
		
		MyClass mc = new MyClass();
		mc.setString("Naman");
		System.out.println(mc);
		
	}
	
	
}
