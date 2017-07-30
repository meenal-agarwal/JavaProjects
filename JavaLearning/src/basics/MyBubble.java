package basics;
import java.util.Arrays;
import java.util.Scanner;

public class MyBubble {

	public static void main(String[] args) {
		
		int ar[] = new int[]{5,9,3,7,1,2};
		int[] br = {5,9,3,7,1,2};
		int cr[] = new int[6];
		int counter = 0;
		int len = (br.length*(br.length-1))/2; 
		System.out.println(len);	
		
//		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<cr.length;i++)
//		{
//			cr[i]=sc.nextInt();
//		}
//		System.out.println("Given array is" + Arrays.toString(cr));
		int gg=0;
		while(counter<br.length)
		{
		for(int j=0;j<br.length-1-counter;j++)
		{
//			
//			gg++;
		if(br[j]<br[j+1])
		     System.out.println("no prob");
		else
		{
			int n = br[j+1];
			br[j+1] = br[j];
			br[j] = n;
		}
		gg++;
		
		}
		counter++;
		
		System.out.println("Given array is "+gg+"    "+counter+ "   " + Arrays.toString(br));
	}
		
		
}
}