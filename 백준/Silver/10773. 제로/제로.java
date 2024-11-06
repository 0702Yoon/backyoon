import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int k = readInt();
        int a;
        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < k; i++) {
            a = readInt();
            if (a == 0) {
                integerStack.pop();
            } else {
                integerStack.add(a);
            }
        }
        System.out.println(integerStack.stream().mapToInt(i -> i).sum());
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(br.readLine());
    }
}