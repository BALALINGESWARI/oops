package filereading;


import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter fr=new FileWriter("C:/Users/Vignesh/Desktop/File2.txt");
		String s="hi..this is bala";
		fr.write(s);
		fr.flush();
		fr.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
