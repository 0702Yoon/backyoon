import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line;
        boolean success;
        Stack<Character> stack = new Stack<>();
        while (true) {
            stack.clear();
            success = true;
            line = br.readLine();
            if (line.equals(".")) {
                break;
            }
            for (char current : line.toCharArray()) {
                if ((current == '(' || current == '[')) {
                    stack.push(current);
                }
                if (current == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        success = false;
                        break;
                    }
                }
                if (current == ']') {
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
