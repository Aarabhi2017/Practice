package ArraysTest2;
public class Editions {

    boolean findEditions(String s1,String s2)
    {
	if(s1==null || s2==null) return false;
	
	if(s1.length()==s2.length()) return oneReplace(s1,s2);
	
	else if(s1.length()+1==s2.length()) return oneEdit(s2,s1);
	
	else if(s1.length()==s2.length()+1) return oneEdit(s1,s2);
	
	return false;
    }
    
    boolean oneReplace(String s1,String s2)
    {
	int c = 0;
	char[] arr1 = s1.toCharArray();
	char[] arr2 = s2.toCharArray();
	
	for(int i = 0, j = 0 ;i<s1.length()-1&&j<s2.length()-1;i++,j++)
	{
	    if(arr1[i]!=arr2[j])
		c++;
	}
	if(c>1) return false;
	
	return true;
    }
    
    boolean oneEdit(String s1,String s2)
    {
	int i = 0 , j = 0, count = 0;
	
	char[] arr1 = s1.toCharArray();
	char[] arr2 = s2.toCharArray();
	
	while(i<arr1.length&&j<arr2.length)
	{
	    if(arr1[i]!=arr2[j])
	    {
		i++;
		count++;
		if(count>1)
		{
		    break;
		}
	    }
	    else
	    {
		j++;
		i++;
	    }
	}
	
	return count>1?false:true;
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Editions s = new Editions();
	System.out.println(s.findEditions("pale", "bale"));
	System.out.println(s.findEditions("Pake", "Base"));
	System.out.println(s.findEditions("pale", "pae"));
	System.out.println(s.findEditions("bales", "bale"));


    }

}
