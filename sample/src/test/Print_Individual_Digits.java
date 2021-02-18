package test;

public class Print_Individual_Digits {

	public static void main(String[] args) {
		int num=1548,rem=0;
		while(num>0)
		{
			rem=num%10;
			System.out.println(rem);
			num=num/10;
		}

	}

}
