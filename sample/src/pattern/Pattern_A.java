package pattern;

public class Pattern_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=4;col++)
			{
				if(((col==1)||(col==4))&&(row==1))
				{
					System.out.print(" ");
				}
				else if(((col==2)||(col==3))&&((row==2)||(row==4)||(row==5)))
				{
					System.out.print(" ");
					
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
