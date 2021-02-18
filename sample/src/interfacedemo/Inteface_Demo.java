package interfacedemo;


class A implements Sample_Interface{

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("this is dog from A");
		
	}

	@Override
	public void roars() {
		// TODO Auto-generated method stub
		System.out.println("this is lion from A");
		
	}
	
	
}
public class Inteface_Demo implements Sample_Interface{

	public static void main(String[] args) {

		Sample_Interface si=new Inteface_Demo();
		si.bark();
		si.roars();
		si.msg();
		int c=Sample_Interface.cube(3);
		System.out.println("Cube of a: "+c);
//		Sample_Interface a=new First();
//		a.bark();
//		a.roars();
//		a.msg();
//		
		
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("this is dog");
	}

	@Override
	public void roars() {
		// TODO Auto-generated method stub
		System.out.println("this is lion");
	}



}
