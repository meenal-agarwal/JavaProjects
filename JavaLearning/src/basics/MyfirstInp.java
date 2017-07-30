package basics;
import java.io.*;

public class MyfirstInp {
	
	public static void main(String args[]) throws IOException{
	
		int c;
		String b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("exit when q get entered");
		
		do{
//			c = (char) br.read();
			  b = br.readLine();
			System.out.println(b);
		} while(b!= "q");
	}

}
