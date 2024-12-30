
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, temp, current;
        int n = sc.nextInt();
        current = sc.nextInt();
        max = current;
        temp = current;
        for (int i = 1; i < n; i++) {
            current = sc.nextInt();
            temp += current;
            if (current > 0) {
                if (current > temp) {
                    temp = current;
                }
                if (temp > max) {
                    max = temp;
                }
            } else {
                if (current > max) {
                    max = current;
                }
            }
        }
        System.out.print(max);
    }
}
