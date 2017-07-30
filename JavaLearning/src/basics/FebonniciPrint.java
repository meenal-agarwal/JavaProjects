package basics;

public class FebonniciPrint {
	
	static int n = 0;
	static int m = 1;
	

	static void print(int x){
		if(x>2){
			int y = n+m;
			n=m;
			m=y;
			System.out.print(" "+y);
//			x=x-1;
			print(x-1);
		}
	}

	public static void main(String[] args) {
		System.out.print(n+" "+m);
		print(10);
		
	}
}

