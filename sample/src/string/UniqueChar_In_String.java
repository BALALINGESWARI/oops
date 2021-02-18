package string;

public class UniqueChar_In_String {

	public static void main(String[] args) {

		String s="balaa";
		char c[]=s.toCharArray();
		int count=0,i;
		char ch[]=new char[c.length];
		for( i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]!=c[j])
				{
					ch[i]=c[i];
					//c[i]=' ';
					
				
				}
				
			}
			
			//System.out.print(c[i]);

			
			
		}
		System.out.println(count);
		for(int k=0;k<ch.length;k++)
		{
			System.out.print(ch[k]);
		}
	}

}
