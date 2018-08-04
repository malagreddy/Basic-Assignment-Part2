package palindrome;

// program to find whether the number is a palindrome or not
import java.util.Scanner;

public class palindrome {
	public static void main(String args[]) {
		int rem = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int n = num;
		if (num < 0) {
			System.out.println("invalid");
		}
		// check palindrome or not
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			sum = (sum * 10) + rem;
		}
		if (n == sum) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
