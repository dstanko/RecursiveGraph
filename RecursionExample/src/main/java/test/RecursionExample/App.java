package test.RecursionExample;

import java.math.BigInteger;

import test.xml.XMLRecursion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        XMLRecursion xmlR = new XMLRecursion();
//        try {
//			xmlR.parse();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        for(int i= 0; i<=20; i++)
//        {
//        	System.out.println(fib(i));
//        }
//        System.out.println("fibcount: " + fibcount);
//        
//        for(int i= 0; i<=20; i++)
//        {
//        	System.out.println(tailRecursive(i));
//        }
//        System.out.println("tailCount: " + tailcount);
//        System.out.println(diskHanoi(60));
//        System.out.println(factoral(BigInteger.valueOf(50)));
        System.out.println(tailRecursive(50));
        
//        for (int i=1; i<=9; i++)
//        {
//        	System.out.println(factorOfThree(i));
//        }
        
//        System.out.println(ecluids(208, 16));
    }
    
    public static int ecluids(int value1, int value2)
    {
    	if (value2 == 0)
    	{
    		return value1;
    	}
    	else
    	{
    		return ecluids(value2, value1%value2);
    	}
    }
    
    static int fibcount = 0;
    public static long fib(long value)
    {
    	fibcount++;
    	if (value < 2)
    	{
    		return value;
    	}
    	else
    	{
    		return fib(value-1) + fib(value-2);
    	}
    }
    
//    public static int fib2(int value, int total)
//    {
//    	if (value < 2)
//    	{
//    		return total;
//    	}
//    	else
//    	{
//    		return fib2(value-1, total +)
//    	}
//    }
  
    public static long diskHanoi(long value)
    {
    	if (value == 1)
    	{
    		return value;
    	}
    	else
    	{
    		return 2 * diskHanoi(value-1) + 1;
    	}
    }
    
    public static BigInteger factoral(BigInteger value)
    {
    	return fact2(value, BigInteger.ONE);
    }
    
    public static BigInteger fact2(BigInteger value, BigInteger total)
    {
    	if (value.compareTo(BigInteger.ONE) <= 0)
    	{
    		return total;
    	}
    	else
    	{
    		return fact2(value.subtract(BigInteger.ONE), value.multiply(total)); 
    	}
    }
    
    public static long factorOfThree(long value)
    {
    	if (value == 1)
    	{
    		return 2;
    	}
    	else
    	{
    		return 3 * factorOfThree(value - 1);
    	}
    }
    
    public static void myMethod( int counter)
    {
    if(counter == 0)
         return;
    else
           {
           System.out.println("hello" + counter);
           myMethod(--counter);
           System.out.println(""+counter);
           return;
           }
    } 
    
    
    public static long tailRecursive(long n) {
        if (n == 0)
        {
        	return 0;
        }
        else if (n <= 2) {
            return 1;
        }
        return tailRecursiveAux(0, 1, n);
    }
     static int tailcount = 0;
    private static long tailRecursiveAux(long beforelast, long last, long count) {
    	tailcount++;
        if(count <= 1) { 
            return last;
        }
        return tailRecursiveAux(last, beforelast+last, count-1);
    }
    
}
