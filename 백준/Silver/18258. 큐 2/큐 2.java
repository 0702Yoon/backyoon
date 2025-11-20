import java.util.*;

 public class Main{
         private static StringBuilder sb = new StringBuilder();
        public static void main(String[] args){
            Deque<String> de = new LinkedList<>();
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            for(int i=0;i<n;i++){
                String[] line = sc.nextLine().split(" ");
                switch(line[0]){
                    case "push":
                        de.addLast(line[1]);
                            break;
                    case "front":
                        if(de.isEmpty()){
                            print("-1");
                        }else{
                            print(de.peekFirst());
                        }
                        break;
                    case "back":
                        if(de.isEmpty()){
                            print("-1");
                        }else{
                            print(de.peekLast());
                        }
                        break;            
                    case "pop":
                        if(de.isEmpty()){
                            print("-1");
                        }else{
                            print(de.pop());
                        }
                        break;
                    case "size":
                        print(String.valueOf(de.size()));
                        break;
                    case "empty":
                        if(de.isEmpty()){
                            print("1");
                        }else{
                            print("0");
                        }
                        break;
                }
            }
            System.out.print(sb);
        }
        private static void print(String a){
            sb.append(a).append("\n");        
        }
    }