package basics;
import java.util.Arrays;

public class MyBub {

	public static void main(String[] args) {
		
		int br[] = new int[]{5,9,3,7,1,2};
	
		for(int i=0;i<br.length-1;i++)
		{
			for(int j=i+1;j<br.length;j++){
				if(br[i]>br[j])
				    // System.out.println("no prob");
			//	else
				{
					int n = br[j];
					br[j] = br[i];
					br[i] = n;
				}
			}
		}
		System.out.println("Given array is" + Arrays.toString(br));
	}
}
