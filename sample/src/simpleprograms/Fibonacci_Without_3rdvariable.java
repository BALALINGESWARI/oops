package simpleprograms;

public class Fibonacci_Without_3rdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1;
		for(int i=1;i<=10;i++)
		{
			n2=n1+n2;
			
			System.out.print(" "+n2);
			n1=n2-n1;
			
		}
		

	}

}
