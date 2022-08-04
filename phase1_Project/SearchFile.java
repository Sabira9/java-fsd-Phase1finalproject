package phase1_Project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SearchFile {

	public  void searchfil() throws IOException
	{
		Scanner sc=new Scanner(System.in);
		String path="C:\\Users\\SABIRA NAZAR\\Documents\\New files\\";
		System.out.println("\nEnter the file to be searched:");
		String filename=sc.next();
		int flag=0;
		File f=new File(path);
		File files[]=f.listFiles();
	    for(File ff:files)
	    {
	    	if(ff.getName().equals(filename))
	    	{
	    		flag=1;
	    		break;
	    	}
	    }
	    if(flag==1)
	    	System.out.println("Successfull Search-File found");
	    else
	    	System.out.println("Failed Search-File not found");
	    }
		

	}

