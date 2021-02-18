package string;

public class Reverse_String_Print_Only_Vowels {

	public static void main(String[] args) {

		String s="ane ice ball hi";
		String word="";
		for(int i=s.length()-1;i>=0;i--)
		{
			word=word+s.charAt(i);
			//System.out.println(word);
		}
		System.out.print(word);
		String str[]=word.split(" ");
		System.out.println();
		for(int j=0;j<str.length;j++)
		{
			//System.out.println(str[j]);
			if(str[j].charAt(0)=='a'||str[j].charAt(0)=='e'||str[j].charAt(0)=='i'||str[j].charAt(0)=='o'||str[j].charAt(0)=='u')
			{
				System.out.print(str[j]+" ");
			}
			
		}


		
	}

}
