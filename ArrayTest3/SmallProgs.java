package ArrayTest3;

public class SmallProgs {

    int powOf8(int n)
    {
	return (1 << 3*n);
    }
    
    int multiplyBy7(int n)
    {
	return ((n<<3)-n);
    }
    void printSeq(int n)
    {
	for(int j = n;j>=1;j--)
	{
	    for(int i = j;i>=1;i--)
	    {
		System.out.print(i);
	    }
	    System.out.print("\n");
	}
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	SmallProgs sp = new SmallProgs();
	System.out.println(sp.powOf8(2));
	System.out.println(sp.multiplyBy7(3)+"\n");
	sp.printSeq(4);
    }

}
