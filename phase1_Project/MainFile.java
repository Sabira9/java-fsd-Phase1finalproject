package phase1_Project;

import java.io.IOException;
import java.util.Scanner;

public class MainFile {

	public static void main(String[] args) throws IOException {
		CreateFile c=new CreateFile();
		DeleteFile d=new DeleteFile();
		DisplayFile dis=new DisplayFile ();
		SearchFile s=new SearchFile();
		Scanner sc=new Scanner(System.in);
		System.out.println("File Navigator");
		System.out.println("Developer:SABIRA NAZAR");
		System.out.println("-----------------------------------------------------------------\n");
		label1:
		while(true)
		{
		System.out.println("\nFile Operations:");
		System.out.println("------------------------------------------------------------------");
		System.out.println("1.Displaying the Files");
		System.out.println("2.Perform business-level Operations");
		System.out.println("3.Quit the application\n");
		System.out.println("Enter your option:");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:dis.displayfil();
		        break;
		        
		case 2: label: 
			   while(true)
		       {
			   System.out.println("\nBusiness-level Operations");
			   System.out.println("-------------------------------------------------");
		       System.out.println("1.Create a new File");
		       System.out.println("2.Delete a File");
		       System.out.println("3.Search a File");
		       System.out.println("4.Back to Main menu\n");
			   System.out.println("Enter your choice:");
			   int choice=sc.nextInt();
			   switch(choice)
			   {
			   case 1:c.createfil();
			   break;
			   case 2:d.deletefil();
			   break;
			   case 3:s.searchfil(); 
			   break;
			   case 4:continue label1;
			   default:System.out.println("Invalid choice");
			   break;
			   } continue label;
			   } 
		case 3:System.out.println("\nClosing your Application......\n Thank you!");
		       System.exit(option);
		        break;
		default:System.out.println("Invalid choice");
		break;
		}
		}
		

}
}
