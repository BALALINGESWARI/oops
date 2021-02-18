package simpleprograms;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean check=true;
		 System.out.println("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		for(int div=2;no>div;div++)
		{
			if(no%div==0)
			{
				check=false;
				//System.out.println("not a prime number");
				break;
			}
		}
		if(check==true)
		{
			System.out.println(no+" is prime number");
		}
		else if(check==false)
		{
			System.out.println(no+" is not a prime number");
		}
		sc.close();
	}

}
