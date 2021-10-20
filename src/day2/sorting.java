package day2;

public class sorting {
	public static void main(String[] args) {
	     int [] a = new int [] {5, 2, 8, 7, 1};         
	      for (int i = 0; i < a.length; i++) {     
            for (int j = i+1; j < a.length; j++) {     
               if(a[i] < a[j]) {    
                  int  temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
               
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");    
        }  
	}

}
