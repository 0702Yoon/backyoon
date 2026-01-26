import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = line[0]+1;
            int target = line[1];
            int[][] map = new int[n][3];

            int[] condition = { 0, 0, 0 };

            for (int i = 1; i < n; i++) {
                int[] ele = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int[] medal = { ele[1], ele[2], ele[3] };
                map[ele[0]] = medal;
                if (ele[0] == target) {
                    condition = medal;
                }
            }
            int grade = 1;
            outer: for (int i = 1; i < n; i++) {
                if (i == target) {
                    continue;
                }

                for (int j = 0; j < 3; j++) {
                    if (map[i][j] > condition[j]) {
                        grade++;
                        continue outer;
                    } else if (map[i][j] < condition[j]) {
                        continue outer;
                    }
                }
            }
            System.out.println(grade);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
