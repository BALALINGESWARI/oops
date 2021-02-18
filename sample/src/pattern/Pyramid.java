package pattern;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=3;row++)
		{
			for(int space=2;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col1=1;col1<=row;col1++)
			{
				System.out.print("*");
			}
			for(int col2=1;col2<row;col2++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
