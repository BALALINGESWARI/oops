package multidimentionalarray;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[3][3];
		int j;
		for(int i=0;i<a.length;i++)
		{
			for( j=0;j<a[i].length;j++)
			{
				b[i][j]=a[j][i];
				System.out.print(" "+b[i][j]);

			}
			System.out.println();
		}
		
	}

}
