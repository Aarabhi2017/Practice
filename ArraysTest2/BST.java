package ArraysTest2;

public class BST {

    int binarySearchTree(int[] array)
    {
	if(array.length-1<=0) return -1;
	
	return search(array,0,array.length-1,634);
    }
    
    int search(int[] arr, int low,int high,int n)
    {
	while(low<high)
	{
	    int mid = (low+high)/2;
	    
	    if(arr[mid]==n)
		return mid;
	    
	    else if(arr[mid] < n)
		return search(arr,mid+1,high,n);
	    else
		return search(arr,low,mid-1,n);
	}
	return -1;
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	BST bst = new BST();
	int[] arr = {12,13,15,63,332};
	System.out.println(bst.binarySearchTree(arr));
    }

}
