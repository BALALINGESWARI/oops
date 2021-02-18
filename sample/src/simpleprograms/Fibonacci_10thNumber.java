package simpleprograms;

public class Fibonacci_10thNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1;
		int count=1;
		System.out.println("Fibonacci series: ");
		for(int i=0;i<=15;i++)
		{
			n2=n1+n2;
			
			System.out.print(" "+n2);
			n1=n2-n1;
			count++;
			if(count==10)
			{
				System.out.println();
				System.out.println("10th fibonacci: "+n2);
				
			}
		}
		

	}

}
