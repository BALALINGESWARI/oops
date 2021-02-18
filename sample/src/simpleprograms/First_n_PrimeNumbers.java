package simpleprograms;

public class First_n_PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=3,div=3,count=1;boolean check=true;
		while(count<20)
		{
			if(no%div==0)
			{
				check=false;
				break;
			}
			div=div+2;
		}
		if(check==true)
		{
			System.out.println(no+" is prime");
			count++;
		}
		else
		{
			System.out.println(no+" is not prime");
		}
		no=no+2;
			}

}
