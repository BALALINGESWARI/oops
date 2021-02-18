package pattern;

public class Pattern_13579_9753_135_97_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row=0;row<=4;row++)
		{
			int a=1,b=9;
			for(int col=4;col>=row;col--)
			{
				if(row%2==0)
				{
					
					System.out.print(a);
					a=a+2;
				}
				else {
					
					System.out.print(b);
					b=b-2;
				}
	
			}
			System.out.println();
		}
		

	}

}
