package simpleprograms;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=25,sum=0,div=1;
		while(no>div)
		{
		if(no%div==0)

		{
			sum=sum+div;
		}
		div++;
		}
		if(no==sum)
		{
			System.out.println(no+" is perfect number");
		}
		else
		{
			System.out.println(no+" is not perfect number");
		}
	}

}
