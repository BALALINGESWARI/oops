package string;

public class Parent_Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Parent1");
		String s2=new String("child2");
		String s3=new String("Grand child3");
		
		char[]char1=s1.toCharArray();
		
		for(int i=0;i<char1.length;i++)
		{
			if((char1[i]>47)&&(char1[i]<58))
			{
				System.out.println("Parent1: "+char1[i]);
			}
			
			
		}
		
		char[]char2=s2.toCharArray();
		for(int j=0;j<char2.length;j++)
		{
			if((char2[j]>47)&&(char2[j]<58))
			{
				System.out.println("child2: "+char2[j]);
			}
			
			
		}
		
		char[]char3=s3.toCharArray();
		for(int k=0;k<char3.length;k++)
		{
			if((char3[k]>47)&&(char3[k]<58))
			{
				System.out.println("Grand child3: "+char3[k]);
			}
			
			
		}
		

	}

}
