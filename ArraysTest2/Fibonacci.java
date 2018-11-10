package ArraysTest2;

public class Fibonacci {

    void fibo(int n)
    {
	if(n<0) System.out.println(-1);
	for(int i = 0 ;i<=n ; i++)
	{
	    System.out.println(fib(i));
	}
    }
    int fib(int n)
    {
	if(n == 0) return 0;
	if(n == 1) return 1;
	
	return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Fibonacci f = new Fibonacci();
	f.fibo(6);

    }

}
