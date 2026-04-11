import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        try {
            int n = (int) readLong(br); // 시험장
            st = new StringTokenizer(br.readLine());
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            long b = Integer.parseInt(st.nextToken());
            long c = Integer.parseInt(st.nextToken());

            long result = n;
            for(int i=0;i<n;i++){
                long x = arr[i] - b;
                if( x <= 0){
                    continue;
                }
                result += x / c;
                if(x%c>0){
                    result++;
                }
            }
            System.out.println(result);
        } catch(IOException e){

        }
    }
    private static long readLong(BufferedReader br) throws IOException{
            return Long.parseLong(br.readLine());
    }
}
