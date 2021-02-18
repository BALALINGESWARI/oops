package filereading;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		String name=null;
		try {
		//	String name=null;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter file name: ");
			 name=sc.nextLine();
          	 
		FileReader fr=new FileReader("C:\\Users\\Vignesh\\Documents\\"+name);
		int i;
		while ((i=fr.read())!=-1)
		  {
			System.out.print((char)i);
		     }
		FileWriter fw=new FileWriter("C:\\Users\\Vignesh\\Documents\\"+name);
		 name="";
		fw.write(name);
		fw.flush();
		fw.close();
		}
	
		catch(Exception e)
		{
			//System.out.println(e);
			try {
			FileWriter fw=new FileWriter("C:\\Users\\Vignesh\\Documents\\"+name);
			 name="I'm not ";
			fw.write(name);
			fw.flush();
			fw.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
		}
		
		

	}

}
