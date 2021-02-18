package simpleprograms;

public class GCD_or_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=12,no2=30;
		int min=no1<no2?no1:no2;
		while(min>=2)
		{
		if((no1%min==0)&&(no2%min==0))
		{
			System.out.println(min);
			break;
		}
		min--;
	}
	}

}
