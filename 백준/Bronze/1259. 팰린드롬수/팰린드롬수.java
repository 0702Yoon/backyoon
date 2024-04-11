import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        int n, mok, temp, jari, back;
        line = br.readLine();
        n = Integer.valueOf(line);

        while (!(n == 0)) {
            sb.append(line);
            sb.reverse();

            if (n == Integer.valueOf(sb.toString())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            line = br.readLine();
            n = Integer.valueOf(line);
            sb.delete(0, sb.toString().length());
        }

    }
}
