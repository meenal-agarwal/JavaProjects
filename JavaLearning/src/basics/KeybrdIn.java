package basics;
import java.util.Scanner;

public class KeybrdIn {
	
	static String name;
	
	public static void Name(String name){
		System.out.println("My name is " + name);
	}

	public static void main(String[] args) {
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter Your name:");
		 name = sb.nextLine();
		 Name(name);
			
	}
		
//		  name = sb.nextLine();
		// KeybrdIn kb = new KeybrdIn();
		 
		//kb.Name(name);
		
}

