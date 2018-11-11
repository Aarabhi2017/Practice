
public class SubstringSearch {

    static boolean search(String a,String b)
    {
	if(b.length()>a.length())
	    return false;
	
	int l = b.length();
	
	for(int i = 0;i<a.length();i++)
	{
	    String newString = a.substring(i, l);
	    System.out.println(newString);
	    if(newString.equalsIgnoreCase(b))
	    	return true;	
	    l++;
	}
	
	return false;
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println(search("Angallena","len"));
    }

}
