package string;

public class Vowels_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Education";
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char  c=str.charAt(i);
			 switch(c)
			 {
			 case 'a':
			 case 'A':
			 case 'e':
			 case 'E':
			 case 'i':
			 case 'I':
			 case 'o':
			 case 'O':
			 case 'u':
			 case 'U':count++;
			 System.out.print(" "+c);
				 
			 }
			 
			 


		}
		System.out.println();
		System.out.println("Count: "+count);

	}

}
