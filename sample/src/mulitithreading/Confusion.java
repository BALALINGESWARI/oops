package mulitithreading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


class x extends Thread {

	public  synchronized void run() {
		
		try {
			
			FileReader fr = new FileReader("C:\\Users\\Vignesh\\Desktop\\pay.txt");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}

			fr.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}

class y extends Thread {

	public void run() {

		try {
			sleep(1000);
			FileWriter fw = new FileWriter("C:\\Users\\Vignesh\\Desktop\\pay.txt");
			String s = "java is developed by sun micro systems."
					+ "\njava is a high level programming language."+"\nIt is developed by JAMES GOSLING."+"\njava is fun";
			fw.write(s);
			fw.flush();
			fw.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
}	

public class Confusion {

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x x1=new x();
		x1.start();
		y y1=new y();
		y1.start();
		 
		
		

	}

}
