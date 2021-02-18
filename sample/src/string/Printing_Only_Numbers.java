package string;

public class Printing_Only_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="12nhsj56vvs45hha7";
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if((c[i]>='0')&&(c[i]<='9'))
			{
				System.out.print(c[i]);
			}
		}

	}

}
