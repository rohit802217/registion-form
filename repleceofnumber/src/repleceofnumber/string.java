package repleceofnumber;

public class string {
	public static void main(String[] args) {
 String s="fasdf656sfd5&%$#@#$%^&";
 String alp="",sum="",sc="";
 
 for( int i=0;i<s.length();i++) {
	  char c=s.charAt(i);
	  if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
{
	 alp=alp+c;
}
else if(c>='0'&& c<='9') {
	sum+=c;
}
else
{
	sc+=c;
}
	  
 }
 System.out.println(alp+sum+sc);
	
	}

}
