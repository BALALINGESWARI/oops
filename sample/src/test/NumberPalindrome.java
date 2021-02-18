package test;

public class NumberPalindrome {

	public static void main(String[] args) {

		
		int num=15551,rem=0,sum=0,no2=num;
		while(num>0)
		{
			rem=num%10; //1  2  1
			sum=(sum*10)+rem;// 0+1=1 1*10=10+2=12
			num=num/10; //12
			
		}
		System.out.println(sum);
		
		if(no2==sum)
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
		
	}

}
