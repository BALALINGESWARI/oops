package methods;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading mo=new MethodOverLoading();
		mo.fillform("bala",12345,"bala@gmail.com");
		mo.fillform("parvathy", 67890, 123455,"paru@gmail.com");
		

	}

	private int fillform(String name, int num, int aadhar, String mail) {
		// TODO Auto-generated method stub
		System.out.println("name:"+name);
		return aadhar;
		
		
	}

	private void fillform(String name, int num, String gmail) {
		// TODO Auto-generated method stub
		System.out.println("gmail: "+gmail);
		
	}

	

}
