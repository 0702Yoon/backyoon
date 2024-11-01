import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        String selectMenu;
        Stack stack = new Stack();
        StringTokenizer st;
        while (count < n) {
            st = new StringTokenizer(br.readLine());
            selectMenu = st.nextToken();
            switch (selectMenu) {
                case "1":
                    stack.push(st.nextToken());
                    break;
                case "2":
                    if (stack.empty()) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(stack.pop());
                    break;
                case "3":
                    System.out.println(stack.size());
                    break;
                case "4":
                    if (stack.empty()) {
                        System.out.println(1);
                        break;
                    }
                    System.out.println(0);
                    break;
                case "5":
                    if (stack.empty()) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(stack.peek());
                    break;
            }
            count++;
        }
        br.close();
    }
}