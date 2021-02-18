package homework;

public class RepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love java";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					System.out.print(c[j]);
				}
			}
		}

	}

}
