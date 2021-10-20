package day2.assignments;

public class secondsmallst {
	public static void main(String[] args) {
		int[] a= {4,7,6,4,2,8};
		int min1=a[0],min2=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min1) {
				min1=a[i];
			}
			else if(a[i]<min2) {
				min2=a[i];
				
			}
		}
		System.out.println("min2="+min2);
	}

}
