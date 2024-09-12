import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = getIntToken(stringTokenizer);
        int m = getIntToken(stringTokenizer);
        int result = 0;
        stringTokenizer = new StringTokenizer(br.readLine());
        int[] sumArry = new int[n + 1];
        for (int j = 1; j < n + 1; j++) {
            sumArry[j] += sumArry[j - 1] + getIntToken(stringTokenizer);
        }
        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            result =
                -sumArry[getIntToken(stringTokenizer) - 1] + sumArry[getIntToken(stringTokenizer)];
            System.out.println(result);
        }
    }

    private static Integer getIntToken(StringTokenizer stringTokenizer) {
        return Integer.valueOf(stringTokenizer.nextToken());
    }
}
