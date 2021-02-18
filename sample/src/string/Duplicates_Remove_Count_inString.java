package string;

public class Duplicates_Remove_Count_inString {

	public static void main(String[] args) {

		String str="bala";
		char c[]=str.toCharArray();
		int count=0,j;
		for(int i=0;i<c.length;i++)
		{
			for( j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[i]=' ';
					count++;
				}
				
				//System.out.print(c[i]);	
			}
			if(c[i]!=' ')
			{
				System.out.print(c[i]);
			}
			if(c[i]==c[j])
			{
				c[i]&&c[j]==' ';
			}
			//System.out.println();
			//System.out.print(c[i]);
		}
		System.out.println(count);
		
		

		
	}

}
