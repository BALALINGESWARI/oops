package string;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []s= {"s","o","a","y","k","i"};
	
		
	
		for(int i=0;i<s.length;i++)
		{
			char [] c=s[i].toCharArray();
			 
			for(int j=i+1;j<c.length;j++)
			{
				
				if(c[i]>c[j])
				{
				int	tmp= (char)c[i];
					c[i]=c[j];
					c[j]=(char)tmp;
				}
			}
			for(int k=0;k<c.length;k++)
			{
				System.out.print(" "+c[k]);
			}
		}
		
		
	
		
	}

}
