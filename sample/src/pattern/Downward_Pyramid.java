package pattern;

public class Downward_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row=1;row<=3;row++)
		{
			for(int space=1;space<row;space++)
			{
				System.out.print(" ");
			}
			for(int col1=3;col1>=row;col1--)
			{
				System.out.print(row);
			}
			for(int col2=2;col2>=row;col2--)
			{
				System.out.print(row);
			}
			System.out.println();

		}

	}

}
