import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int p = Integer.parseInt(br.readLine());
            for(int testC=1;testC<=p;testC++){
                int result = cal(br.readLine());
                System.out.println(testC+" "+ result);
            }
        }catch(Exception e){
            /*
            19 18 15 17 16
            
            15 17 18 19

            15 16 17 18 19
            
            => 이러면 17 1번
            근데 16보다 뒤에 있었으면 0번임.
            
            자기보다 큰게 앞에 있으면 의미 없나. 작은게 앞에 있으면 의미 없나
            뒤에 작은게 있으면? 4개가 작아 그러면 +4?
            뒤에 큰게 있어 의미 없지 않나

            
            */
        }
    }
    private static int cal(String line){
        int[] ele = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for(int i=1;i<20;i++){
            int target = ele[i];
            for(int j=i+1;j<=20;j++){
                if(target>ele[j]){
                    result += 1;
                }
            }
        }
        return result;
    }
}
