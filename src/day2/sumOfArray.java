package day2;

public class sumOfArray {
	static int arr[] = {13,3,9,4,23};
    
    static int sum()
    {
        int sum = 0;
        int i;
      
        for (i = 0; i <arr.length; i++)
           sum =sum+ arr[i];
      
        return sum;
}
     
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is " + sum());
       }
}


