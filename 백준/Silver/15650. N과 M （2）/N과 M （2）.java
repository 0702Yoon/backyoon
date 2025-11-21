import java.util.Scanner;

public class Main {
    static int n,m;
    static boolean[] isUsed = new boolean[10];
    static int[] buffered = new int[8];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        funC(0);
        System.out.println(sb);
    }
    private static void funC(int current){
        if(current == m){
            for(int i=0;i<m;i++){
                sb.append(buffered[i]).append(" ");
            }
            return;
        }
        for(int i=1;i<=n;i++){
            if(!isUsed[i]){
                if(current>0){
                    if(buffered[current-1] >i){
                        continue;
                    }
                }
                buffered[current] = i;
                isUsed[i] = true;
                funC(current+1);
                isUsed[i] = false;
            }
        }
    }
}
