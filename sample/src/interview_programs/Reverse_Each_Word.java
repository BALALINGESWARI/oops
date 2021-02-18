package interview_programs;

public class Reverse_Each_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i am bala lingeswari";
		String[] words = str.split(" ");
		String reversedString = "";
		/*for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	   }*/	
		for(int i=0;i<words.length;i++)
		{
			if(i==words.length-1)
			{
				String reverseString = words[i]+reversedString;
			}
			else
			{
				reversedString=" "+words[i]+reversedString;
			}
		}
		System.out.println(reversedString);
	}

}
