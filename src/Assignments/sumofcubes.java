package Assignments;

public class sumofcubes {

	    public static int sumOfSeries(int n)
	    {
	        int sum = 0;
	        for (int x=1; x<=n; x++)
	            sum =sum+ x*x*x;
	        return sum;
	    }
	  
	    public static void main(String[] args)
	    {
	        int n = 5;
	        System.out.println(sumOfSeries(n));
	  
	    }
	}


