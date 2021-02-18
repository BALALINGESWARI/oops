package oops;

public class InnerClass {

	class b
	{
		final void m()
		{
			System.out.println("hi");
		}
	}
	public static void main(String[] args) {
		
		InnerClass id=new InnerClass();
		InnerClass.b b1=id.new b();
		b1.m();
		
		 
		
	

	}

}
