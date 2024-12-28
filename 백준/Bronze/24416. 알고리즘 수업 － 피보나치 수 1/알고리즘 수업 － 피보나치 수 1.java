import java.util.Scanner;

public class Main {

    public static int a = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
        System.out.print(a + " " + (n - 2));
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            a++;
            return 1;
        }
        return (fib(n - 1) + fib(n - 2));
    }
}
