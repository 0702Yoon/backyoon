import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int m;
    static boolean[] used;
    static int[] buffer;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m =  Integer.parseInt(st.nextToken());
        used = new boolean[n+1];
        buffer = new int[m];

        back(0);
        System.out.println(sb);
    }
    private static void back(int numberCount){
        if(numberCount==m){
            for(int i=0;i<m;i++){
                sb.append(buffer[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1;i<=n;i++){
            if(!used[i]){
                buffer[numberCount] = i;
                used[i] = true;
                back(numberCount+1);
                used[i] = false;
            }
        }
    }
}
