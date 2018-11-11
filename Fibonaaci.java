
public class Fibonaaci {

    public int fib(int n)
    {
	if(n<=0) return 0;
	else if(n==1) return 1;
	else return fib(n-1)+fib(n-2);	
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Fibonaaci fib = new Fibonaaci();
	System.out.println(fib.fib(3));
    }

}
