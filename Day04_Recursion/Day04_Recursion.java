import java.util.*;

public class Day04_Recursion {
    public static void main(String[] args) {

        System.out.println("5! = " + factorial(5));
        System.out.println("Sum 1..5 = " + recursiveSum(5));
        System.out.println("Fibonacci(10) iterative = " + fibonacci(10));

    }

    static long factorial(int n)
	{ 
		return n<=1?1:n*factorial(n-1); 
	}
	
	static int recursiveSum(int n)
	{ 
		return n==0?0:n+recursiveSum(n-1); 
	}
	
	static long fibonacci(int n)
	{ 
		if(n<=1)
			return n; 
			long a=0,b=1; 
	    for(int i=2;i<=n;i++)
		{
			long c=a+b;a=b;b=c;
		} 
		return b; 
	}
	
}
