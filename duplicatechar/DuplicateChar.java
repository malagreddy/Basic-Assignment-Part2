package duplicatechar;

//program to eliminate the duplicate characters from the string
import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String word = sc.nextLine();
		int length = word.length();
		char ch;
		String ans = "";
		for (int i = 0; i < length; i++) {
			ch = word.charAt(i);// returns character value at the specific index
			if (ch != ' ')
				ans = ans + ch;
			word = word.replace(ch, ' ');
		}
		// prints the string after removing all duplicate characters
		System.out.println("string is" + ans);

	}

}
