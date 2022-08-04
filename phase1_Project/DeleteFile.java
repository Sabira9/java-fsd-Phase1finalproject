package phase1_Project;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class DeleteFile {

	public void deletefil()  throws IOException {
		Scanner sc=new Scanner(System.in);
		String path="C:\\Users\\SABIRA NAZAR\\Documents\\New files\\";
		System.out.println("\nEnter the filename to be deleted:");
		String filename=sc.next();
		String newpath=path+filename;
		File f=new File(newpath);
		boolean b=f.delete();
		if(b!=true)
		{
			System.out.println("file not found");
		}
		else
		{
			System.out.println("file deleted");
		}
	}

}
