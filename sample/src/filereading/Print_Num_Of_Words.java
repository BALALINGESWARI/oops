package filereading;

import java.io.FileReader;

public class Print_Num_Of_Words {

	public static void main(String[] args) {

		try
		{
			FileReader fr=new FileReader("C:/Users/Vignesh/Desktop/File IO/File1.txt");
			int i,count=1;
			while((i=fr.read())!=-1)
			{
				if(i==' ')
				{
					count++;
				}
				
				System.out.print((char)i);
			}
			System.out.print(count);
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
