package homework;

public class Non_RepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am Ram";//IamR
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
			{
	if(c[i]!=' ')
	{
				for(int j=i+1;j<c.length;j++)
				{
					
					if(c[i]==c[j])
					{
						
						c[j]=' ';
					}

					
				}
				System.out.print(c[i]);
	}
				
				}

	}

}
