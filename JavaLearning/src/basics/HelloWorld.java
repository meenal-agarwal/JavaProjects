package basics;
public class HelloWorld {
	
	public void display()
	{
		System.out.println("Welcome Eclipse");
	}

	public static void main(String args[])
	{
	    System.out.println("Hello World.");   
	    
	    HelloWorld hw = new HelloWorld();
	    hw.display();
	    
	    ChecktoString chks = new ChecktoString();
	    chks.date(1, 2, 3);
	}
	
	

}
