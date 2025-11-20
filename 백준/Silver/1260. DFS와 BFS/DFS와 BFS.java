import java.util.*;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Start = sc.nextInt();
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i =0; i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }
        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[N+1];
        s.push(Start);

        while(!s.isEmpty()){
            int condition = s.pop();
            if (visited[condition]) continue;
            visited[condition] = true;

            sb.append(condition).append(" ");
            ArrayList<Integer> neighbors = adjList.get(condition);
            Collections.sort(neighbors);
            for(int i=neighbors.size()-1;i>=0;i--){
                int e = neighbors.get(i);
                if(!visited[e]){
                    s.push(e);
                }       
            }
        }
        System.out.println(sb.toString());
        sb.setLength(0);            


        
        Queue<Integer> q = new LinkedList<>();
        visited = new boolean[N+1];
        q.add(Start);
        visited[Start]= true;
        while(!q.isEmpty()){
            int condition = q.poll();
            sb.append(condition).append(" ");
            for(Integer e :adjList.get(condition)){
                if(!visited[e]){
                    q.add(e);
                    visited[e] = true;
                }
            }
        }
        System.out.println(sb.toString());
    }
}