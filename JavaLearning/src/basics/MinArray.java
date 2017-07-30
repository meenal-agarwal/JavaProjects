package basics;

public class MinArray {
	
	int x[];
	int cal;
	public MinArray(int a[]){
		x = a;	
	}
	
	public void calArray(){
		
		for(int i=0; i<x.length; i++){
			int dec = 1 << x[i];
			cal+= dec;
		}
	}
	
	public static void main(String[] args) {
		MinArray arr = new MinArray(new int[]{2,3,4,1});
		arr.calArray();
		System.out.println(arr.cal);
		
	}
}
