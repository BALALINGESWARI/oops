package mestech;

public class RemoveDupilcates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="bala lingeswari";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[i]+" ");
				}
			}
		}
		

	}

}
