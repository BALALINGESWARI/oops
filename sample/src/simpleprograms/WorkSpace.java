package simpleprograms;

public class WorkSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int no1=1,no2=2,no3;
//		for(int i=1;i<=10;i++)
//		{
//		no3=no1+no2;// no1=no1+no2;// 1+2 // 3; 
//		System.out.print(no3+" ");//no1=3
//		no1=no2;//no1=no1-no2// 3+2//5
//		no2=no3;//no2=
//		}
//		
		
		// first 100 prime numbers
//		int div=2; boolean check=true;
//		for(int i=2;i<=15;i++)
//		{
//			for(int no=i;no>=1;no--)
//			{
//				if(i%no==0)
//				{
//					check=false;
//					System.out.println(no+" is not prime");
//				}
//			}
//			
//			if(check==true)
//			{
//				System.out.println(i+" is prime");
//			}
//		}
		
		
//			DECIMAL TO BINARY
		
		int no=4;String rem=" ";
		while(no>0)
		{
			rem=(no%2)+rem;
			no=no/2;
			System.out.println(rem+" "+no);
		}
		
		String a="G";
		String dd="k";
		
		String x=dd+a;
		String y=a+dd;
		System.out.println(x);
		System.out.println(y);
		
		//System.out.println(1%2);
		//System.out.println(rem);
	}

}
