import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 0이하면 다 1이고, 20초과면 20으로 돌아오니까..
    static int[][][] dp = new int[21][21][21];
    static int a, b, c;
    static volatile boolean run = true;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        allocation(st = new StringTokenizer(bufferedReader.readLine()));
        run = checkLoop();
        while (run) {
            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
            allocation(st = new StringTokenizer(bufferedReader.readLine()));
            run = checkLoop();
        }
    }

    private static boolean checkLoop() {
        return !(a == -1 && b == -1 && c == -1);
    }

    private static void allocation(StringTokenizer st) {
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
    }

    static int w(int a, int b, int c) {
        if (rangeCheck(a, b, c) && dp[a][b][c] != 0) {
            return dp[a][b][c];
        }
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        if (a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20, 20, 20);
        }
        if (a < b && b < c) {
            return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        }
        return dp[a][b][c] =
            w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
    }

    private static boolean rangeCheck(int a, int b, int c) {
        return a <= 20 && b <= 20 && c <= 20 && a >= 0 && b >= 0 && c >= 0;
    }
}