package array;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {27,89,67,90,56};
		int b[]= {78,7,56,45,45};
		
		int c[]=new int[a.length];
		for(int i=0;i<c.length;i++)
		{
			c[i]=a[i]+b[i];
			System.out.print(" "+c[i]);
		}
	}

}
