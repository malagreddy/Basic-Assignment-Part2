//program to reverse a string
package stringreverse;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();

		String[] word = str.split(" ");
		String reverse = "";
		for (int i = 0; i < word.length; i++) {
			for (int j = word[i].length() - 1; j >= 0; j--) {
				reverse += word[i].charAt(j);
				// Returns the char value at the specified index
			}

			System.out.print(reverse + " ");
			reverse = "";
		}

	}

}
