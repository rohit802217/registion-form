package repleceofnumber;
import java.util.*;

public class replasesumofdigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		 int arr[]=new int[size];
		 for(int i =0;i<arr.length;i++) {
			 
			 arr[i]=sc.nextInt();
		 }
		 int rem=0,sum=0;
 		 for(int i=0;i<arr.length;i++) {
			 int n;

			 while(n>0)
			 {
				 rem=arr[i]%10;
				 sum +=rem;
				 arr[i]=arr[i]/10;
				 
			 }
			 arr[i]=sum;
			 System.out.println (arr[i]=arr[i]);

		 }
 		}
 	    

}
