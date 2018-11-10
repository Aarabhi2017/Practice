package ArraysTest2;

public class FindSubstringPerm {

    void permuteSubstring(String s, int start, int length)
    {
	if(s==null)
	    System.out.println("no permutations");
	
	String s1 = substring(s,start,length);
	perm(s1,0);
    }   
    String substring(String s,int start,int length)
    {
	StringBuilder sb = new StringBuilder();
		
	char[]a = s.toCharArray();
	if(start>length) return null;
	
	for(int i = start;i<=length-1;i++)
	{
	    sb.append(a[i]);
	}
	return sb.toString();
    }
    void perm(String s,int pos)
    {
	for(int i = pos ; i<s.length();i++)
	{
	    String r = swap(s,pos,i);
	    perm(r,pos+1);
	    
	    if(r.length()-1==pos) //Not i but pos
	    {
		System.out.println(r);
	    }
	} 	
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
	FindSubstringPerm fsp = new FindSubstringPerm();
	fsp.permuteSubstring("Oxygen", 0, 4);
    }

}
