package interview_programs;

public class Upward_Pyramid {

	public static void main(String[] args) {

		for(int row=1;row<=3;row++)
		{
			for(int space=1;space<row;space++)
			{
				System.out.print(" ");
			}
			for(int star=3;star>=row;star--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
