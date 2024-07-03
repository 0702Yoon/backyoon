import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n + 1];
        int startIndex = 1;
        int endIndex = 1;
        int count = 1;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            array[i] = i;
        }

        while (startIndex < n) {
            if (sum < n) {
                endIndex++;
                sum += array[endIndex];
            } else if (sum > n) {
                sum -= array[startIndex];
                startIndex++;
            } else if (sum == n) {
                count++;
                endIndex++;
                sum += array[endIndex];
            }
        }
        System.out.println(count);
    }
}
