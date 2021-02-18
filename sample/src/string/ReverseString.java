package string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i like java";
		String word[]=s.split(" ");
		String revstr=" ";
		String revword=" ";
		for(int i=0;i<word.length;i++)
		{
			
			System.out.println(word[i]);
			for(int j=word.length-1;j>=0;j--)
			{
				String word2=word[j];
				revword=revword+word2;
				//System.out.print(word2.charAt(j));
				//System.out.print(word[j]);
			}
			revstr=revstr+revword+" ";,
			
			
		}
		System.out.print(revstr);
	}
}
