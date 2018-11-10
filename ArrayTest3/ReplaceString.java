package ArrayTest3;

public class ReplaceString {

    String replaceStrings(String input, int tl)
    {
	int space = 0;
	for(int i=0;i<tl;i++)
	{
	    if(input.charAt(i)==' ')
		space++;
	}
	
	int index = tl+space*2;
	int j = index - 1;
	char[] inp = input.toCharArray();
	
	for(int i = tl-1;i>=0;i--)
	{
	    if(inp[i]==' ')
	    {
		inp[j--] = '0';
		inp[j--] = '2';
		inp[j--] = '%';
	    }
	    else
		inp[j--] = inp[i];
	}
	return String.valueOf(inp);
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ReplaceString rs = new ReplaceString();
	System.out.println(rs.replaceStrings("Mr John Smith    ", 13));
	System.out.println("HELLO");
    }

}
