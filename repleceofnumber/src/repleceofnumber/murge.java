package repleceofnumber;

import java.util.Scanner;

public class murge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		 int arr[]=new int[size];
		 int arr1[]=new int[size];
		 for(int i =0;i<arr.length;i++) {
			 
			 arr[i]=sc.nextInt();
			 arr1[i]=sc.nextInt();
			
 
	}
		int  b=arr.length;
		int c=arr1.length;
		int c1=b+c;
	        int[] c2 = new int[c1]; 
        for(int i=0;i<arr.length;i++) {
        	c2[i]=arr[i];
        }
		 System.out.println(c2[i]);
 
 }
  
	 
}
