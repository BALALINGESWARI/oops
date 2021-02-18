package pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			for(int j=i;j<2;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
