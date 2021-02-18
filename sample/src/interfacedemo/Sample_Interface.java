package interfacedemo;

public interface Sample_Interface {
	void bark();
	void  roars();
	default void msg()
	{
		System.out.println("Hi..This is default msg");
	}
	static int cube(int a)
	{
		return a*a*a ;
		
	}

}
