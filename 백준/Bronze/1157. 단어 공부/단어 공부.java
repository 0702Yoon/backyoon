import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w = br.read();
        long[] arr = new long[26];
        while(w >= 65 && w <= 122){
            // a: 97
            // z: 122
            // A: 65
            // Z: 90
            if(w>=97){
                w -= 32;
            }
            arr[w-65] += 1;
            w = br.read();
        }

        long maxCount = -1;
        int maxIndex = -1;
        boolean duplicate = false;

        for(int i=0;i<26;i++){
            if(maxCount < arr[i]) {
                maxCount = arr[i];
                maxIndex = i;
                duplicate = false;
            }else if(maxCount == arr[i]){
                duplicate = true;
            }
        }
        
        if(duplicate){
            System.out.println("?");
        }else{
            System.out.println((char) (maxIndex +65));
        }
    }
}
