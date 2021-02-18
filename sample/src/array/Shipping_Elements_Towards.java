package array;

public class Shipping_Elements_Towards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[]= {10,20,30,40,50,60};
		int i=0,temp=m[i];
		while(i<m.length-1)
		{
			m[i]=m[i+1];
			i++;
			System.out.println("Marks: "+m[i]);

		}
		m[i]=temp;
		System.out.println("Marks: "+m[i]);
	}

}
