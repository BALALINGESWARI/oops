package filereading;

import java.io.File;

public class FolderCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Vignesh\\Desktop\\Folder1\\subfolder1\\subfolder2");
		boolean present=file.exists();
		System.out.println("Folder present: "+present);
		if(present==false)
		{
			file.mkdirs();
		}
		present=file.exists();
		System.out.println("Folder present: "+present);
		

	}

}
