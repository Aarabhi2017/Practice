package ArraysTest2;

public class permutation {

    void permutation(String s)
    {
	perm(s,0);
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
	permutation per = new permutation();
	per.permutation("ABC");

    }

}
