package ArraysTest2;

public class SmallProgs {

    int PowOf2(int n)
    {
        if(n==1) 
        { 
            System.out.println(1); 
            return 1;
        }
        else if(n<1) return 0;
        
        else
        {
            int prev = PowOf2(n/2);
            int curr = prev * 2;
            
            return curr;
        }
        
        
    }
     int bitMultiplyBy8(int n)
     {
	 if(n==0) return 0;
	 
	 return n<<3;
     }
    boolean isPrime(int n)
    {
	for(int x = 2;x*x<n;x++)
	{
	    if(n%x==0) return true;
	    
	}
	    return false;
    }
    
    void print(String a)
    {
	for(int i = 2;i<a.length();i+=3)
	{
	    System.out.print(a.charAt(i));
	}
    }
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	SmallProgs sp = new SmallProgs();
	System.out.println(sp.PowOf2(5));
	System.out.println(sp.isPrime(13));
	System.out.println(sp.bitMultiplyBy8(3));
	System.out.println(sp.bitDivideBy2(12));
	sp.print("GayleLakmann");
    }
    int bitDivideBy2(int i) {
	// TODO Auto-generated method stub
	if(i==0) return 0;
	return i>>1;
    }

}
