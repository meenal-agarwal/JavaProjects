package test;

public class Solution {
	
	public int solution(int[] A) {  
		
		if(A.length < 3)
        return -1;
    
    int dep = 0;

    int P = 0, Q = -1, R = -1;

    for (int i = 1; i < A.length; i++)
    {
        if (Q < 0 && A[i] >= A[i-1]) 
            Q = i-1;

        if ((Q >= 0 && R < 0) &&
            (A[i] <= A[i-1] || i + 1 == A.length))
        {
            if (A[i] <= A[i-1])
                R = i - 1;
            else
                R = i;
            
            dep = Math.max(dep, Math.min(A[P]-A[Q], A[R]-A[Q]));
            P = i - 1; 
            Q = R = -1;
        }
    }
    if (dep == 0) 
    	dep = -1;
    
    return dep;}
	
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		int a = s.solution(new int[]{0,1,3,-2,0,1,0,-3,2,3});

		System.out.println(a);
	}

}
