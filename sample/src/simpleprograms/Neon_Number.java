package simpleprograms;

public class Neon_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=9,sum=0,rem=0;
		int square=no*no;
		while(square>0)
		{
			rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		System.out.println("sum of sq. digits :"+sum);
		if(no==sum) {
			System.out.println("this is neon number");
		}
		else
		{
			System.out.println("this is not neon number");
		}

	}

}
