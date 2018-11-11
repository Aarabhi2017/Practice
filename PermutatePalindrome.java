
public class PermutatePalindrome {

    int combo = 0;
    String swap(int i,int pos,String a)
    {
	char[] arr = a.toCharArray();
	char temp = ' ';
	
	temp = arr[i];
	arr[i] = arr[pos];
	arr[pos] = temp;
	
	return String.valueOf(arr);
    }
    boolean palindrome(String newString)
    {
	for(int i = 0,j=newString.length()-1;i<=j;i++,j--)
	{
	    
	    if(newString.charAt(i)==' ') i++;
	    if(newString.charAt(j)==' ') j--;
	    
		//System.out.println(i+"=i\t"+ j+"=j\t"+ newString.charAt(i)+" at i\t"+ newString.charAt(j)+" at j");
		
	    if(newString.charAt(i)!=newString.charAt(j))
		return false;
	}
	    return true;
    }
    void permutate(String a,int pos)
    {
	for(int i = pos;i<a.length();i++)
	{
	    String newString = swap(i,pos,a);
	    permutate(newString,pos+1);
	    if(pos==newString.length()-1)
	    {
		if(palindrome(newString))
		{
		   System.out.println(newString);
		}
	    }
	}
    }    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	PermutatePalindrome pp = new PermutatePalindrome();
	pp.permutate("tact coa",0);
	//System.out.println(pp.palindrome("oac attc"));
    }
}
