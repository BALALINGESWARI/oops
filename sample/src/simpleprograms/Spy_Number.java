package simpleprograms;

public class Spy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1124,sum=0,rem,sum1=1;
		
		while(no>0)
		{
			rem=no%10;
			sum=sum+rem;
			sum1=sum1*rem;
			no=no/10;
		}
		System.out.println(sum);
		System.out.println(sum1);
		if(sum==sum1)
		{
			System.out.println("This is spy number");
		}
		else
		{
			System.out.println("This is not spy number");
		}

	}

}
