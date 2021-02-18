package oops;


public class MultipleInheritance extends X {

	
	void n()
	{
		
	}
	public static void main(String[] args) {

		MultipleInheritance mp=new MultipleInheritance();
	     mp.m();
		X bb=new X();
		bb.m();
		
		
	}

}
class X 
{
	void m()
	{
		System.out.println("hi");
	}
	
}
class Y
{
	
	void m()
	{
		System.out.println("hello");
	}
}
