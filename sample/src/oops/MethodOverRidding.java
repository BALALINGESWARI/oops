package oops;

public class MethodOverRidding  extends OverRide{

	void m()
	{
		System.out.println("Bala lingeswari");
	}
	public static void main(String[] args) {
		
		MethodOverRidding mo=new MethodOverRidding();
		mo.m();
		
		
	}

}
class OverRide
{
	
	void m() {
		System.out.println("deepika");
	}
}
