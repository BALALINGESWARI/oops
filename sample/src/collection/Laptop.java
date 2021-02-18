package collection;

public class Laptop {
	String brand;
	int price;
	int gb;
	boolean touch;

	public Laptop(String brand, int price, int gb, boolean touch) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
		this.price=price;
		this.gb=gb;
		this.touch=touch;
	}
	public String toString()
	{
		return " "+this.brand+" : "+this.price+" : "+this.gb+" : "+this.touch;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
