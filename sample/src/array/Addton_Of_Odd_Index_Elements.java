package array;

public class Addton_Of_Odd_Index_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,67,45,98,35,24};
		int total=0;
		for(int i=1;i<a.length;i+=2)
		{
			total=total+a[i];
		}
		System.out.println("Total: "+total);

	}

}
