
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        첫 문자가 나올때까지 푸쉬하고 팝.그다음 나오면 또 팝 또 나올때 까지 푸쉬 반복 팝
//      그러니까 팝했는 데 목표 숫자보다 크면 게임 끝
//            근데 만약에
//                그 다음 숫자가 더 낮아tj 팝을 해야하는 데 그 숫자가 팝한 것보다 낮으면 no

        try (Scanner sc = new Scanner(System.in)) {
            int total = sc.nextInt();
            int[] arr = new int[total];
            for (int i = 0; i < total; i++) {
                arr[i] = sc.nextInt();
            }
            Stack<Integer> stack = new Stack<>();
            int num = 1;
            StringBuffer bf = new StringBuffer();
            int target;
            boolean result = true;
            for (int i = 0; i < total; i++) {
                target = arr[i];
                if (target >= num) {
                    while (target >= num) {
                        stack.push(num++);
                        bf.append("+\n");
                    }
                    stack.pop();
                    bf.append("-\n");
                } else {
                    int n = stack.pop();
                    if (n > target) {
                        System.out.println("NO");
                        result = false;
                        break;
                    } else {
                        bf.append("-\n");
                    }
                }
            }
            if (result) {
                System.out.println(bf.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}