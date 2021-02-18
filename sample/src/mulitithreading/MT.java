package mulitithreading;
class A extends Thread
{
	public void run()
	{
		for(int no=1;no<=100;no++)
		{
			int count=0;
			int div=2;
			while(div<no)
			{
			if(no%div==0)
			{
				count=count+1;
				
			}
			div++;
			
			if(no==50)
			{
				stop();
			}
			}
			if(count==0)
			{
				/*try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				
				
				System.out.println("prime: "+no);
				
				
			}
			else
			{
				//System.out.println("Not prime: "+no);
			}
		}
		
	}
	
}
class B extends Thread
{
	public void run()
	{
		
		for(int no=1;no<=100;no++)
		{
			int div=1;
			int sum=0;
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
				System.out.println("perfect num: "+sum);
				
			}
			else
			{
				//System.out.println("not perfect:"+sum);
			}
		}
	}
}
class C extends Thread
{
	public void run()
	{
		int fact=1;
		for(int i=1;i<=12;i++)
		{
			fact=i*fact;
			
		}
		System.out.println("Factorial: "+fact);
		
	}
}




public class MT {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			A a1=new A();
			B b1=new B();
			C c1=new C();
			a1.start();
			b1.start();
			c1.start();
	}

}
