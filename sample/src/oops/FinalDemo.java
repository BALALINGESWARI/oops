package oops;

public class FinalDemo extends D{

	void m()
	{
		System.out.println("Hi..This is Final Demo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalDemo fm=new FinalDemo();
		fm.m();
		

	}
	
}

class C
{
	void m()
	{
		System.out.println("hi..This is C");
	}
}
 class D extends C
{
	void m()
	{
		System.out.println("hi..This is D");
	}
}

