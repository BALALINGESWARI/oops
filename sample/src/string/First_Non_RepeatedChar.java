package string;

public class First_Non_RepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "window";
		char c[]=str.toCharArray();
		
		
		
		for(int i=0;i<c.length;i++)
		{
			
			boolean repeat=false;
			
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					repeat = true;	
					break;
				}
			}
			if(repeat==false)
			{
				System.out.println(c[i]);
				break;
			}
			
			
		}
		

	}

}
