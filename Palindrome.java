package mynewproject;
import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int orginal=num;
		int reverse=0,remainder;
		while(num>0) {
			remainder=num%10;
			reverse= reverse*10+remainder;
			num=num/10;
		}
		if(orginal==reverse) {
			System.out.println("The number is a palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		sc.close();
	}
	
	

}
