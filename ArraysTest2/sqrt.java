package ArraysTest2;

public class sqrt {

    int sqrt(int n)
    {
	return sqrthelper(n,1,n);
    }
    
    int sqrthelper(int n,int min, int max)
    {
	if(min>max)
	    return -1;
	int guess = (min+max)/2;
	
	if(guess * guess == n)
	    return guess;
	
	else if(guess*guess<n)
	    return sqrthelper(n,guess+1,max);
	
	else return sqrthelper(n,min,guess-1);
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	sqrt s = new sqrt();
	System.out.println(s.sqrt(64));
    }

}
