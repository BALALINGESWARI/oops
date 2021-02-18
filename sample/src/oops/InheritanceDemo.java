package oops;

class A
{
	static void m()
	{
		System.out.println("hi.. this is M()");
	}
	 private int a=10;
//	void n()
//	{
//		System.out.println("hi..this is N()");
//	}
}


class B extends A
{
	static void m()
	{
		System.out.println("hi..this is another m()");
	}
	

	
}
//class C extends B
//{
//	void p()
//	{
//		System.out.println("hi..this is P()");
//	}
//}

public class InheritanceDemo {

	
	public static void main(String[] args) {

//		C c=new C();
//		c.m();
//		c.n();
//		c.o();
//		c.p();
//		System.out.println();
//		A a=new A();
//		a.m();
//		a.n();
		B b=new B();
		b.m();
		
		
	
		
		

	}

}
