package repleceofnumber;

public class stringasdf 
{
	public static void main(String[] args) 
	{
		String s="heloosH";
 		  String ans="";
		 for( int i=0;i<s.length();i++) 
		 {
			  char c=s.charAt(i);
 			  if(c>='A'&&c<='Z')
 			  {
 				  c+=32;
 			  }
 			  else if (c>='a'&&c<='z')
 			  {
 				  c-=32;
 			  }
 			 
 			ans+=c;  
				  
			  }
		 System.out.println(ans);

		 }
 	}


