package test;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=123,rem=0,sum=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
			
		}
		System.out.println(sum);

	}

}
