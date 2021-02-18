package pattern;

public class Number_3_32_321_Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row=1;row<=5;row++)
		{
			for(int col1=4;col1>=row;col1--)
			{
				System.out.print(" ");
			}
			for(int col2=1;col2<=row;col2++)
			{
				System.out.print(col2);
			}
			System.out.println();
		}

	}

}
