package pattern;

public class Pattern_9_98_876_7654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;
		for(int row=1;row<=4;row++)
		{
			a++;
			for(int col=1;col<=row;col++)
			{
				System.out.print(a);
				a--;
			}
			System.out.println();
		}

	}

}
