
public class RotationOfAnArray {

    public static int[] rotation(int[] arr,int rf)
    {
	if(arr.length==0) return arr;
	rf = rf%arr.length;
	while(rf>0)
	{
		int i = 0;
	    	int starter = arr[i];
		for(i = 0;i<arr.length-1;i++)
		{
		    arr[i] = arr[i+1];
		}
		arr[i] = starter;
		rf--;
	}
	return arr;
	
    }
    public static void printArr(int[] arr)
    {
	    for(int i = 0;i<arr.length;i++)
	    {
		System.out.println(arr[i]);
	    }
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] arr = {1,2,3,4,5};
	printArr(rotation(arr,4));
	
    }

}
