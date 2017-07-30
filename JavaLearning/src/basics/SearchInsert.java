package basics;

public class SearchInsert {

	public int searchPosition(int ar[], int x) {
		int i = 0;
		int j = ar.length-1;
		int num = (i+j)/2;
		while(x != ar[num]){
			if (x < ar[num]) {
				num = (i + num) / 2;
			} 
			else {
				num = (j + num) / 2;
			}
		}
		return num;
	}
	
	
	public int binarySearch(int a[],int x){
		int start =0;
		int end = a.length-1;
		
		
		while(start<end)
		{
			int mid = (start+end)/2;
			if(a[mid] == x)
			{
				return mid;
			}
			
			if(x < a[mid]){
				end = mid;
			}else{
				start = mid +1;
			}
			
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		SearchInsert sch = new SearchInsert();
		int index = sch.binarySearch(new int[]{2,6,8,11,13,14,15,17,19,20,22},15);
		System.out.println(index);
	}
}
