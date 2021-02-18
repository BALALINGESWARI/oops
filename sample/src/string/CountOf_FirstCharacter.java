package string;

public class CountOf_FirstCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word=new String("aileassaaa");
		char first=word.charAt(0);
		int count=1;
		for(int i=1;i<word.length();i++)
		{
			if(first==word.charAt(i))
			{
				count++;
			}
		}
		
		System.out.println("Count: "+count);
			}

}
