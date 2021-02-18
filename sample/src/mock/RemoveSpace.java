package mock;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" bala lingeswari ";
		//char[] ch=str.toCharArray();
		char ch[]=new char[str.length()]; 
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
			System.out.print(ch[i]);
		}
		System.out.println();
		int i;
		for( i=0;i<ch.length;i++)
		{
			if(i!=0&&i!=ch.length-1) // if(ch[i]!=32)
			{
						
					String s="";
					str=s+ch[i];
					System.out.print(str);//without using valueof()
				
				//str=String.valueOf(ch[i]);//wit using valueof()
				//System.out.print(str);
				
			}
			
						

		}
				

	}

}
