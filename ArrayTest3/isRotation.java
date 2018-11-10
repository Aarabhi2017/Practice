package ArrayTest3;

public class isRotation {

    boolean isRotation(String s1, String s2)
    {
	int l = s2.length();
	if(s1.length()==l&&l>0)
	{
	    String s1s1 = s1+s1;
	    //return false;
	    return isSubstring(s1s1,s2);
	}
	
	return false;
    }
    
    boolean isSubstring(String s,String s2)
    {		
	char[]a = s.toCharArray();
	char[]b = s2.toCharArray();
	
	for(int i = 0;i<=s.length()-1;i++)
	{
	    
	}
	
	return false;
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
