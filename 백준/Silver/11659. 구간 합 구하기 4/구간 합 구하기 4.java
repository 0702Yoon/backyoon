import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] partSum = new int[Integer.parseInt(st.nextToken()) + 1];
        partSum[0] = 0;
        int N = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 1; i < partSum.length; i++) {
            partSum[i] = partSum[i - 1] + Integer.parseInt(st2.nextToken());
        }
        for (int i = 0; i < N; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            System.out.println(
                -partSum[Integer.parseInt(st3.nextToken()) - 1] + partSum[Integer.parseInt(
                    st3.nextToken())]);
        }
    }
}
