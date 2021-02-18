package oops;

public class Encapsulation {

	private int a;
	private int b;
	
	private int getA() {
		return a;
	}

	private void setA(int a) {
		this.a = a;
		
	}

	private int getB() {
		return b;
	}

	private void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {

		Encapsulation e=new Encapsulation();
		System.out.println(e.a);
		
		
		e.setA(100);
		e.setB(200);
		int c=e.a+e.b;
		System.out.println(e.getA());
		System.out.println(e.getB());
		System.out.println(c);
		
	}

}
