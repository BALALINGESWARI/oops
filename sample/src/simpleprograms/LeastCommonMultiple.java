package simpleprograms;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=12,no2=44;
		int max=no1>no2?no1:no2;
	while(true)
	{
		if((max%no1==0)&&(max%no2==0))
		{
			System.out.println("LCM: "+max);
			break;
		}
		max++;
	}

	}

}
