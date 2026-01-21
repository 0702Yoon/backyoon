import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        String conditoin = "0 0 0";
        while(!line.equals(conditoin)){
            int[] elements = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

            if(elements[2]>=elements[0]+elements[1]){
                System.out.println("Invalid");
            }else{
            // 2 3 5    
            //     10, 11, 101
            //     10 & 11  => 10
            //     10 & 10 -> 10
            
            if((elements[2] & elements[1]) == elements[2]){
                if( (elements[1] & elements[0]) == elements[1]){
                    System.out.println("Equilateral");
                }else{
                    System.out.println("Isosceles");
                }
            }else if((elements[1] & elements[0]) == elements[1]){
                    System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
                }
            }
            line = br.readLine();
        }
    }
}
