import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(multi(Integer.valueOf(bufferedReader.readLine())));
    }

    public static int multi(int i) {
        if (i > 0) {
            return i * multi(i - 1);
        } else if (i == 0) {
            return 1;
        }
        return 0;
    }
}