package ArraysTest2;

public class Compression {

    String compression(String a)
    {
	StringBuilder sb = new StringBuilder();
	int c = 1;
	char[] arr = a.toCharArray();
	
	for(int i = 0;i<arr.length-1;i++)
	{
	    if(arr[i]!=arr[i+1]||(i+1)==arr.length-1)
	    {
		sb.append(arr[i]);
		sb.append(c);
		c = 1;
	    }
	    else
	    {
		c++;
	    }
	}
	
	if(sb.length()<a.length())
	    sb.toString();
	
	return sb.toString();
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Compression c = new Compression();
	System.out.println(c.compression("aabbbcccddefggsss"));
    }

}
