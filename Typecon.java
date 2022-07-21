import java.util.Scanner;

public class Typecon {
	int num;
	char c;
	public static void main(String[] args) {
		int b;
				
		Typecon type=new Typecon();
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		type.num=s.nextInt();
		//NARROWING-explicit type casting
		type.c=(char) type.num;
		System.out.println("Narrowing:" +type.c);
		//WIDENING-Implicit type casting
		b=type.c;
		System.out.println("Widening:" +b);
		
	}

}
