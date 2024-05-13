
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = sc.nextInt();
		int[] numberArray = new int[n];
		int[] sumArray = new int[n];
		for (int i = 0; i < n; i++) {
			numberArray[i] = sc.nextInt();
		}
		sumArray[0] = numberArray[0];
		for (int i = 1; i < n; i++) {
			sumArray[i] = sumArray[i - 1] + numberArray[i];
		}
		for (int i = 0; i < count; i++) {
			int start = sc.nextInt() - 1;
			int end = sc.nextInt() - 1;
			try {
				System.out.println(sumArray[end] - sumArray[start - 1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(sumArray[end]);

			}
		}
	}
}