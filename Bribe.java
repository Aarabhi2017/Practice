
public class Bribe {

    static void minimumBribes(int[] q) {
	if(q==null) return;
	
	boolean flag = false;
	int mainCounter = 0;
	int i;
	
	for(i=q.length-1;i>=0;i--)
	{
	    int swapCounter = 0;
	    if(q[i]==i+1)
	    {
		continue;
	    }
	    else if(i>0 && q[i-1]==i+1)
	    {
		//Swap q[i-1],q[i]
		swapCounter++;
	    }
	    else if(i>1 && q[i-2]==i+1)
	    {
		//Swap q[i-2],q[i-1]
		//Swap q[i-1],q[i]
		swapCounter = swapCounter + 2;
	    }
	    else
	    {
		System.out.println("Too chaotic");
		flag = true;
		break;
	    }
	    mainCounter+=swapCounter;
	    while(swapCounter>0)
	    {
		int temp = q[i-swapCounter];
		q[i-swapCounter] = q[i-swapCounter+1];
		q[i-swapCounter+1] = temp;
		
		swapCounter--;
	    }
	}
	if(i<0)
	    System.out.println(mainCounter);
    }
	
    
   
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] q = {2,1,5,3,4};
	int[] q1 = {2,5,1,3,4};
	//{1,2,3,4,5,6,7,8}
	//{1,2,3,5,4,6,7,8}
	//{1,2,5,3,4,6,7,8}
	//{1,2,5,3,4,7,6,8}
	//{1,2,5,3,7,4,6,8}
	//{1,2,5,3,7,4,8,6}
	//{1,2,5,3,7,8,4,6}
	//{1,2,5,3,7,8,6,4}
	
	
	int[] q2 = {1,2,5,3,7,8,6,4};
	//{1,2,5,3,7,6,8,4}
	//{1,2,5,3,7,6,4,8}
	//{1,2,5,3,6,7,4,8}
	//{1,2,5,3,6,4,7,8}
	//{1,2,5,3,4,6,7,8}
	//{1,2,3,5,4,6,7,8}
	//{1,2,3,4,5,6,7,8}
	
	//{1,2,5,3,7,6,8,4}
	//{1,2,5,3,7,6,4,8}
	
	
	minimumBribes(q2);

    }

}
