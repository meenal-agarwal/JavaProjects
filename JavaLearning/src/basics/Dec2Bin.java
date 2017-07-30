package basics;

public class Dec2Bin {
	
	int num;
	String res = new String();
	
	Dec2Bin(int x){
	num = x;	
	}

	public String divide(){
		
		while(num>0){
			int rem = num%2;
			num = num/2;
			res =  rem + res ;
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		Dec2Bin db = new Dec2Bin(12);	
		System.out.println(db.divide());
	}
}
