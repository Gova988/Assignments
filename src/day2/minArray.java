package day2;

public class minArray {
	public static void main(String[]  args) {
		int a[]= {10,23,9,5,4};
		int index=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[index])
				index=i;
			
		}
		System.out.println("smallest=" +a[index]);
	
	}
}