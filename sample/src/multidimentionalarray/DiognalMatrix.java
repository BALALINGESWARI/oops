package multidimentionalarray;

public class DiognalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					a[i][j]=1;
				}
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}

	}

}
