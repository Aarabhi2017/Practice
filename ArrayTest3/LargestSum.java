package ArrayTest3;

public class LargestSum {

    int largestSum(int[] array)
    {
	int s = 0;
	int ms = 0;
	
	for(int i = 0;i<array.length;i++)
	{
	    s+=array[i];
	    if(ms<s)
		ms=s;
	    else if(s<0)
	    {
		s=0;
	    }
	}
	return ms;
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	LargestSum ls = new LargestSum();
	int[] array = {-2,3,44,11};
	ls.largestSum(array);
    }

}
