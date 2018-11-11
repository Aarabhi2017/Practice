
public class Permutation {

    static void permutation(String s, int pos)
    {
	for(int i = pos;i<s.length();i++)
	{
	    String newString = swap(i,pos,s);
	    permutation(newString,pos+1);
	    if(pos==s.length()-1)
	    {
		//if(newString.equalsIgnoreCase("taco cat"))
		    System.out.println(newString);
	    }
	}
    }
    static String swap(int i,int pos,String s)
    {
	char[] arr = s.toCharArray();
	char temp = ' ';
	
	temp = arr[i];
	arr[i] = arr[pos];
	arr[pos] = temp;

	return String.valueOf(arr);
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	permutation("tact coa",0);
    }

}
