package string;

public class Highest_Repeated_char {

	public static void main(String[] args) {

		String str="aaabbbbccccc"; int max=0;
		char c[]=str.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
				if(max<count)
				{
					max=count;
				}
				if(c[i]==max)
				{
					System.out.print(c[i]);
				}
			}
			
			
			//System.out.println(c[i]+" = "+count);
			
			
		}
		//System.out.println(max);

		
	}

}
