package basics;

import java.util.Arrays;

public class TwoSum {

	int res[] = new int[2];
	
	public static void main(String[] args) {

		TwoSum ts = new TwoSum();
		boolean b = ts.twoSum(new int[]{2,6,3,8},14);
		int ans[]=ts.res;
		System.out.println(Arrays.toString(ans) + "  " +b);
		
	}
	
	public boolean twoSum(int ar[], int target){
		
		for(int i=0;i<ar.length-1;i++){
			for(int j=i+1;j<ar.length;j++){
				if((ar[i]+ar[j]) == target){
					res[0]=i;
					res[1]=j;
					return true;
				}	
			}
		}
		return false;		
	}
	
}
