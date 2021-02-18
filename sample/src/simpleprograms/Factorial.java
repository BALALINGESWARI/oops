package simpleprograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact=1,no=1;
		while(no<=5)
		{
			fact=fact*no;
			no++;
		}
		System.out.println(fact);
	}

}
