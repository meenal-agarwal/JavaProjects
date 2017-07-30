package basics;

import java.util.Arrays;

public class TwoSumOrder {

	int res[] = new int[2];

	public boolean twoSumOrder(int ar[], int target) {
		
		int i = 0;
		int j = (ar.length)-1;
	
		while (i < j){
			if ((ar[i] + ar[j]) == target) {
				res[0] = i;
				res[1] = j;
				return true;	
			}
			else if ((ar[i] + ar[j]) < target){
				i++;
			}
			else if ((ar[i] + ar[j]) > target){
				j--;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		TwoSumOrder ts = new TwoSumOrder();
		boolean b = ts.twoSumOrder(new int[] { 2, 3, 6, 8 }, 15);
		int ans[] = ts.res;
		System.out.println(Arrays.toString(ans) + "  " + b);

	}

}
