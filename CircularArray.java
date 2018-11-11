import java.util.HashSet;
import java.util.Set;

public class CircularArray {

	    public boolean circularArrayLoop(int[] nums) {
	        if(nums.length<1) return false;
	        
	        Set<Integer> set = new HashSet<Integer>();
	        int i = 0,j=0;
	        
	        while(i<nums.length*2)
	        {
	            //Start with nums[0]
	            int index = nums[i];             
	            if(index>0)
	            {
	                //Move forward nums[index] steps
	                i = index+nums[index];                
	            }
	            else
	            {
	                //Move backward num[index] steps
	                i = index - i;
	            }	                        
	            //Keep track of which indices were visited
	            if(set.contains(j))
	            {
	                return true;
	            }
	            set.add(j);
	            j++;
	        }
	        return false;
	        
	    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
    }

}
