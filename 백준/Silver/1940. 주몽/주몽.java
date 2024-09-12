
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.valueOf(br.readLine());
        int M = Integer.valueOf(br.readLine());
        int[] ary = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::valueOf)
            .sorted()
            .toArray();
        // 정렬 후에 처음과 끝으로 해야겠는 데.
        int start = 0;
        int end = ary.length - 1;
        int count = 0;
        int sum = 0;
        while (start < end) {
            sum = ary[start] + ary[end];
            if (sum > M) {
                end--;
            } else if (sum < M) {
                start++;
            } else if (sum == M) {
                count++;
                start++;
            }
        }
        System.out.println(count);
    }
}
