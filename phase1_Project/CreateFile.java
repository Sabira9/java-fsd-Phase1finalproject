package phase1_Project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

   public class CreateFile 
     {
    	 public void createfil() throws IOException
    	 {
    		 
		Scanner sc=new Scanner(System.in);
		String path="C:\\Users\\SABIRA NAZAR\\Documents\\New files\\";
		System.out.println("\nEnter the new filename:");
		String filename=sc.next();
		String newpath=path+filename;
		File f=new File(newpath);
		boolean b=f.createNewFile();
		if(b!=true)
			{
			System.out.println("file is not created");
			}
		else
		{
			System.out.println("New file is created");
		}
    	 }

		
			
		}
     
