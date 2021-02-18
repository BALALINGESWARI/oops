package sample;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=16,div=3;
		boolean check=true;
		
			while(div<no)
			{
				if(no%div==0)
				{
					check=false;
					System.out.println("this is not prime number");
					break;
				}
				div++;
			}
			
			if(check==true)
				System.out.println("This is prime number");
			
			

	}

}
