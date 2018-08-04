package missingnumber;

// program to find the missing number
import java.util.Scanner;

public class missingnumber {

	public static void main(String[] args) {
		int total = 0, sum;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of elements in array");
		int n = sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sum = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < n; i++) {
			total += arr[i];
		}
		int missingnum = sum - total;
		// prints the missing number
		System.out.println("missing number is" + missingnum);
	}
}
