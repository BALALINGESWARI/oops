package homework;

public class I_Love_Java_to_Java_Love_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love java";
		char c[]=s.toCharArray();
		String[]s2= {};
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				
			}
			System.out.print(c[i]);
		}
		String s1[]=s.split(" ");
		System.out.println();
		for(int i=s1.length-1;i>=0;i-- )
		{
			System.out.println(s1[i]);
		}
		
		

	}

}
