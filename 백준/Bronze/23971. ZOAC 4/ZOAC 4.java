import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int[] ele = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int H = ele[0]; // 행수 5
        int W = ele[1]; // 열수  4
        int N = ele[2]; // 세로로 거리둬야함 1
        int M = ele[3]; // 가로로 거리둬야함 1

        System.out.println( ((W + M) / (M +1 )) * ( (H + N) / (N +1 )) );
    }
}