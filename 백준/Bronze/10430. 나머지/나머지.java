import java.util.*;
import java.io.*;

public class Main{
public static void main(String[] args)  throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer st = new StringTokenizer(br.readLine());
  int a =Integer.valueOf(st.nextToken());
  int b =Integer.valueOf(st.nextToken());
  int c =Integer.valueOf(st.nextToken());
   
   System.out.println((a+b)%c);
   System.out.println((a%c+b%c)%c); 
   System.out.println((a*b)%c);
   System.out.println((a%c*b%c)%c);
    
}
}