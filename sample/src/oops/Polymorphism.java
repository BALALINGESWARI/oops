package oops;

public class Polymorphism {
	
	
	int add(int a, int b)
	{
		return a+b;
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	int add(int a, int b, int c, int d)
	{
		System.out.println(a+b+c+d);
		return a+b+c+d;
	}

	
	public static void main(String[] args) {

		Polymorphism p=new Polymorphism();
		p.add(20, 20, 20, 20);
		p.add(30, 30);
	}

}
