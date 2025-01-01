import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        while (true) {
            stack.clear();
            boolean success = true;
            String line = br.readLine(); // 한 줄 입력받음
            if (line.equals(".")) break;

            for (char current : line.toCharArray()) {
                if (current == '(' || current == '[') {
                    stack.push(current);
                } else if (current == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        success = false;
                        break;
                    }
                } else if (current == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        success = false;
                        break;
                    }
                }
            }

            if (success && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
