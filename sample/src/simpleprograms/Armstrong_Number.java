package simpleprograms;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=153,arm=0,rem=0;
		int no1=no;
		
		while(no>0)
		{
			rem=no%10;
			arm=arm+(rem*rem*rem);
			no=no/10;
		}
		System.out.println(arm);
		if(no1==arm)
			System.out.println("this is armstrong number");
		else
			System.out.println("this is not armstrong number");

	}

}
