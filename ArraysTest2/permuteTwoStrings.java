package ArraysTest2;

public class permuteTwoStrings {
    
    boolean perm(String s,int pos,String b)
    {
	for(int i = pos ; i<s.length();i++)
	{
	    String r = swap(s,pos,i);
	    perm(r,pos+1,b);
	    
		if(r.equalsIgnoreCase(b))
		{
		    return true;
		}
	} 
	return false;
    }
    boolean permute(String a,String b)
    {
	return perm(a,0,b);
    }
    String swap(String s,int pos, int i)
    {
	char temp = ' ';
	char[] arr = s.toCharArray();
	
	temp = arr[i];
	arr[i] = arr[pos];
	arr[pos] = temp;
	
	return String.valueOf(arr);
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	permuteTwoStrings pts = new permuteTwoStrings();
	System.out.println(pts.permute("god","dog"));

    }

}
