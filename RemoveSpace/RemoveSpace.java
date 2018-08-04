
//Program to remove white space from an input string
import java.util.*;

public class RemoveSpace {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();

		StringBuilder str = new StringBuilder();
		int flag = 0;
		// String str2=str.split(" ");
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				str.append(input.charAt(i));
				// if no space,set flag to zero
				flag = 0;
			} else {
				flag++;
				// adding the space after each word
				if (flag == 1) {
					str.append(" ");
				}
			}

		}

		// print the string after removing the extra spaces
		System.out.println("The sentence is " + str.toString());
	}
}
