
package mynewproject;
import java.util.Scanner;

public class Modernswitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Grade");
		String grade= sc.nextLine();
		switch(grade) {
		case "O":
			System.out.println("Outstanding Performance");
			break;
		case "A+":	
		    System.out.println("Excellent Performance");
		    break;
		case "A":
		    System.out.println("Very Good Performance");
		    break;
		case "P":
			 System.out.println("Pass");
			 break;
		case "F":
			System.out.println("Fail");
			 break;
		default:
			System.out.println("Invalid Choice");	 
			
		}
		sc.close();
	
	}

}
