package repleceofnumber;


public class numberintoalpha {



	public static void main(String[] args) {
		int n=52012;
		int n2=0;
		while(n!= 0) {
			int rem = n % 10;
			n2 = n2 * 10 + rem;
			n=n/10;
		}
		int n1=n2;

		System.out.println(n1);
		int rem=0;

		while(n1!=0) 
		{
			rem=n1%10;
			n1=n1/10;
			switch(rem)
			{
			case 0:
				System.out.print("zero");
				break;
			case 1:
				System.out.print("one");
				break;
			case 2:
				System.out.print("Two");
				break;
			case 3:
				System.out.print("three");
				break;
			case 4:
				System.out.print("four");
				break;
			case 5:
				System.out.print("Five");
				break;
			case 6:
				System.out.print("six");
				break;
			case 7:
				System.out.print("Seven");
				break;

			case 8:
				System.out.print("eight");
				break;
			case 9:
				System.out.println("nine");
				break;

			}
		}


	}}
