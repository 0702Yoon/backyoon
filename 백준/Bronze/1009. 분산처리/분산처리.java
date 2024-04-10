import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] point = new int[2];
        List<Integer> set = new ArrayList<>();
        int result, index;
        String[] line;
        for (int i = 0; i < n; i++) {
            line = br.readLine().split(" ");
            point[0] = Integer.valueOf(line[0]);
            point[1] = Integer.valueOf(line[1]);
            result = point[0] % 10;
            set = getResult(set, result, point);
            index = point[1] % set.size();
            if (index == 0) {
                int lastNumber = set.get(set.size() - 1);
                System.out.println(lastNumber == 0 ? 10 : lastNumber);
            } else {
                System.out.println(
                    set.get(index - 1));

            }
            set.clear();
        }
    }

    private static List<Integer> getResult(List<Integer> set, int result, int[] point) {
        do {
            set.add(result);
            result = result * point[0] % 10;
        } while (!set.contains(result));
        return set;
    }
}
