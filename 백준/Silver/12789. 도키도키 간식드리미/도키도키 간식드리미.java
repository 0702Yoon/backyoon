import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int current, stackLast;
        boolean result = true;
        Stack<Integer> stack2 = new Stack<>();
        stackLast = 0;
        for (int i = 0; i < n; i++) {
            current = Integer.parseInt(stringTokenizer.nextToken());
            if (stackLast + 1 == current) {
                stackLast = current;
                stackLast = getStackLast(stack2, stackLast);
            } else {
                if (stack2.isEmpty()) {
                    stack2.add(current);
                } else {
                    if (stack2.peek() < current) {
                        result = false;
                        break;
                    }
                    stack2.add(current);
                }
            }
        }
        if (result) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }

    private static int getStackLast(Stack<Integer> stack2, int stackLast) {
        int stack2Last;
        while (true) {
            if (!stack2.isEmpty()) {
                stack2Last = stack2.pop();
                if (stackLast + 1 == stack2Last) {
                    stackLast = stack2Last;
                } else {
                    stack2.add(stack2Last);
                    break;
                }
            } else {
                break;
            }
        }
        return stackLast;
    }
}
