package pattern;

public class Left_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print(" ");
			}
			
			for(int col2=5;col2>=row;col2--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
