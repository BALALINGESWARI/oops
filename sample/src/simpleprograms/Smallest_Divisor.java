package simpleprograms;

public class Smallest_Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=81,div=2;
		while(no>div)
		{
			if(no%div==0)
			{
				System.out.println("Smallest Divisor: "+div);
				break;
			}
			div++;
		}

	}

}
