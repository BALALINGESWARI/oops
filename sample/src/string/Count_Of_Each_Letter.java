package string;

public class Count_Of_Each_Letter {

	public static void main(String[] args) {

		String str="sameema bhegam";
		
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int count = 0;
			for(int j=0;j<c.length;j++) 
			{
				if(c[i]==c[j])
				{
					count++;
					
					
				}
								
			}
			System.out.print(" "+c[i]+" = "+count+" ");			
				
		}
		
	}

}

