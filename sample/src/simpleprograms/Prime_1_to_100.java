package simpleprograms;

public class Prime_1_to_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no;
		for( no=2;no<=100;no++)
		{
			boolean check=false;
			//int count=0;
			//while(no>div)
			for(int div=2;div<no;div++)
			{
				if(no%div==0)
				{
					check=true;
					//count++;
					break;
					
				}
			}
			if(check==true)
			{
				System.out.println(no+" is not prime number");
			}
			else 
			{
				System.out.println(no+" is a prime number");
			}
			
			
		}
		
		

}
}
