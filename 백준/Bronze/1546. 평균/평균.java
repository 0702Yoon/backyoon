import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] number = sc.nextLine().split(" ");
		int max = Integer.MIN_VALUE;
		double sum = 0;
		for (int i = 0; i < n; i++) {
			if (max < Integer.parseInt(number[i]))
				max = Integer.parseInt(number[i]);
			sum += Integer.parseInt(number[i]);
		}
		System.out.println(sum / max * 100 / n);
	}
}