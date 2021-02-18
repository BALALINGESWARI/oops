package constrctor;

public class Customer {

	String name;
	int customer_id;
	int aadhar;
	int dob;
	int pan_id;
	
	public Customer(String Cust_name, int cus_id, int aadhar_id, int dob, int pan) {
		
		// TODO Auto-generated constructor stub
		
		name=Cust_name;
		customer_id=cus_id;
		aadhar=aadhar_id;
		dob=this.dob;
		pan_id=pan;
		
	}

	public Customer(String Cust_name, int aadhar_id) {
		// TODO Auto-generated constructor stub
		name=Cust_name;
		aadhar=aadhar_id;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer bala=new Customer("bala",101,1234,190898,0011);
		Customer parvathy=new Customer("parvathy",5678);
		bala.applyLoan();
		parvathy.applyLoan();
		
		

	}

	private void applyLoan() {
		// TODO Auto-generated method stub
		
		System.out.println("Name: "+name);
		System.out.println("AAdhar id: "+aadhar);
		
	}

}
