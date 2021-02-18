package filereading;

import java.io.FileReader;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader fr=new FileReader("C:/Users/Vignesh/Desktop/File IO/File1.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
		}
		catch(Exception e)

		{
			System.out.println(e);
		}
		

	}

}
