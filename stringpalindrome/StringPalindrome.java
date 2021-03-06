package stringpalindrome;

// program to take 10 strings and print the palindrome strings
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[10];
		String[] rev = new String[10];
		int loc[] = new int[10];
		int size[] = new int[10];
		int id = 0;
		int temp = 0;
		// take 10 strings as inputs
		System.out.println("Enter the strings");
		for (int i = 0; i < 10; i++) {
			str[i] = sc.nextLine();
			rev[i] = "";
			for (int j = str[i].length() - 1; j >= 0; j--) {
				rev[i] = rev[i] + str[i].charAt(j);
			}
		}
		// checks if the string is palindrome or nots
		for (int i = 0; i < 10; i++) {
			if (str[i].equals(rev[i])) {
				loc[id] = i;
				id += 1;
			}
		}
		for (int i = 0; i < id; i++) {
			size[i] = str[loc[i]].length();
		}
		for (int i = 0; i < id; i++) {
			for (int j = 0; j < id - 1; j++) {
				if (size[j] < size[j + 1]) {
					temp = size[j];
					size[j] = size[j + 1];
					size[j + 1] = temp;
					temp = loc[j];
					loc[j] = loc[j + 1];
					loc[j + 1] = temp;
				}
			}
		}
		System.out.println("Palindrome stings are:");
		for (int i = 0; i < id; i++) {
			System.out.println(str[loc[i]]);
		}
	}

}
