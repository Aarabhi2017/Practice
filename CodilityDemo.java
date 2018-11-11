
public class CodilityDemo {

public int solution(int[] a) {
	
   	int[] b = new int[1000000+1];
   	
   	for(int i :a)
   	{
   	    if(i>0)
   	    {
   		b[i] = i;
   	    }
   	}
   	for(int j = 1;j<b.length;j++)
   	{
   	    if(b[j]==0)
   	    {
   		return j;
   	    }
   	}
   	return -1;
       }
    
    public int maxElement(int[] a)
    {
	int maxIndex = 0;
	for(int i=0;i<a.length;i++)
	{
	    if(a[maxIndex]<a[i])
	    {
		maxIndex = i;
	    }
	}
	return a[maxIndex];
    }
}
