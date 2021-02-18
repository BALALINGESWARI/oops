package filereading;

import java.io.FileReader;

public class Vowels_Word {

	public static void main(String[] args) {

		try
		{
			FileReader fr=new FileReader("C:/Users/Vignesh/Desktop/File IO/File1.txt");
			int i,count=0,pos=0;
			while((i=fr.read())!=-1)
			{
				
				if(i==' ')
				{
				
						if((i=='a')||(i=='e')||(i=='i')||(i=='o')||(i=='u'))
						{
							System.out.print((char)i);
						}
					
					
				}
				//System.out.print((char)i);
				//System.out.println(count);
			}
			fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
