import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int pre1 = 0, pre2 = 0, pre3 = 0;
        int input1, input2, input3;
        int temp1, temp2, temp3;
        StringTokenizer st;
        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            input1 = Integer.parseInt(st.nextToken());
            input2 = Integer.parseInt(st.nextToken());
            input3 = Integer.parseInt(st.nextToken());
            temp1 = Math.min(input1 + pre2, input1 + pre3);
            temp2 = Math.min(input2 + pre1, input2 + pre3);
            temp3 = Math.min(input3 + pre1, input3 + pre2);
            pre1 = temp1;
            pre2 = temp2;
            pre3 = temp3;
        }
        System.out.println(Math.min(pre1, Math.min(pre2, pre3)));
    }
}
