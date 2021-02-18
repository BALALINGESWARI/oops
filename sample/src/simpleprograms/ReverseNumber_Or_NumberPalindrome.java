package simpleprograms;

public class ReverseNumber_Or_NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=132,sum=0,rem=0;
		int no1=no;
		while(no!=0)
		{
		rem=no%10;
		sum=(sum*10)+rem;
		no=no/10;
		}
		System.out.println(sum);
		if(no==sum)
		{
			System.out.println(no1+" is number palindrome");
		}
		else
		{
			System.out.println(no1+ " is not palindrome");
		}
	}

}
