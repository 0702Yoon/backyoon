import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        1: 1
        2: 2~7   / 6
        3: 8 ~19 / 12
        4: 20 ~ 37 : 18
        20 ~ 37  / 18
    
        초과하면 멈추면 되지?
 */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long i = 1;
        long layer = 1;
        if(i==n){
            System.out.println(1);
        }else{
            while(true){
                if(i>=n){
                    System.out.println(layer);
                    break;
                }
                i = i + 6*layer++;
            }
        }
    }
}
