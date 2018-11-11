
public class HourGlass {

    static int hourglassSum(int[][] arr) {
	    //1. Define the hour glass indices , keep the start index, keep max = 0
	    //2. Read array and add indices of hour glass from that index
	    //3. Keep it max if it is lesser than max,  move to next index 
	    //4. Repeat 2 and 3 till end of array
	        
	       int hourglassCol = 5;
	       int hourglassRow = 5;
	        int maxSum = Integer.MIN_VALUE;
	             
	        if(hourglassCol<3||hourglassRow<3)
	            return -1;
	        
	            for(int i = 0 ;i<=hourglassRow-2;i++)
	            {
	        	for(int j = 0;j<=hourglassCol-2;j++)
	        	{
	        	    System.out.println(i+","+j);
	        	   int eachSum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]
	        			+arr[i+2][j+2];
	        	   maxSum =  Math.max(maxSum, eachSum);
	        	}
	        	
	            }

	        return maxSum;
	    }
    
    static int[] rotLeft(int[] a, int d) {
        if(a.length==0||a==null||d==0) return a;
        int d1 =(a.length%d);
    while(d1>0)
    {
        int i = 0;
        int prev = a[i];
        for(i = 0;i<a.length-1;i++)
        {
            a[i] = a[i+1];
        }
        a[i]=prev;
        d1--;
    }
                return a;       
}
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[][]arr = {{1,1,1,0,0,0},
		{0,1,0,0,0,0},
		{1,1,1,0,0,0},
		{0,0,2,4,4,0},
		{0,0,0,2,0,0},
		{0,0,1,2,4,0}};
	System.out.println(hourglassSum(arr));

    }

}
