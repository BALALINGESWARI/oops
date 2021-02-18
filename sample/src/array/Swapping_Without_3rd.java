package array;

public class Swapping_Without_3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[]= {98,87,56,35,67};
		
		System.out.println("Before swapping: ");
		for(int i=0;i<m.length;i++)
		{
			System.out.print(" "+m[i]);
		}
		System.out.println();
		System.out.println("After swapping : ");
		
		m[1]=m[1]+m[3];//122
		m[3]=m[1]-m[3];//87
		m[1]=m[1]-m[3];
		for(int j=0;j<m.length;j++)
		{
			System.out.print(" "+m[j]);
		}
		
		
	}

}
