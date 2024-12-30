import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int line = 1;
        while (num > line) {
            num -= line;
            line++;
        }
        if (line % 2 == 0) {
            System.out.printf("%d/%d", num, line - num + 1);
        } else {
            System.out.printf("%d/%d", line - num + 1, num);
        }
    }
}
