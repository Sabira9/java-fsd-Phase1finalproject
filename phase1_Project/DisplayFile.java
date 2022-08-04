package phase1_Project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DisplayFile {

	public  void displayfil()  throws IOException
	{
				Scanner sc=new Scanner(System.in);
				String path="C:\\Users\\SABIRA NAZAR\\Documents\\New files\\";
				System.out.println("\nList of files:");
				File f=new File(path);
				File files[]=f.listFiles();
			    for(File ff:files)
			    {
			     System.out.println(ff.getName());
			    	
			    }
	}

}
