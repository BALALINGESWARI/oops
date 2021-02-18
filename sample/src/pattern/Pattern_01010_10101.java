package pattern;

public class Pattern_01010_10101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =0;
int b = 1;
		
		
		for(int row=1;row<=5;row++)
	
		{
			for(int col=0;col<=4;col++)
			{
				if(col%2==0)
				{
					System.out.print(a);
				}
				else
				{
					System.out.print(b);
				}
			}
			System.out.println();
             int temp = a;
             a=b;
             b=temp;
             
		}
	}

}
