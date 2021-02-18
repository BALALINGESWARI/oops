package methods;

public class ReturnTypes {
	
	int m()
	{
		return 6;
		
	}
	void n()
	{
		System.out.println("5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypes t1=new ReturnTypes();
		t1.m();
		t1.n();
		
		System.out.println(t1.m());
		//System.out.println(t1.n(););
	}

}
