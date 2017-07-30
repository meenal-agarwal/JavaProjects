package basics;

public class KeyThis {
	
	int a = 100,b = 200;
	
	
	
	KeyThis(int a,int b)
	{
		
		System.out.println(this.a + " " + this.b );
		System.out.println(a + " " + b );
	}
	
	
	public static void main(String[] args) {
		KeyThis ab = new KeyThis(10,30);
	}

}
