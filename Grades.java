package mynewproject;
import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mark");
		int mark= sc.nextInt();
		if(mark>=90){
			System.out.println("Grade A");
		}else if(mark>=75){
			System.out.println("Grade B");
		}else {
			System.out.println("Grade C");
			
		}
		sc.close();
	}
	

}
