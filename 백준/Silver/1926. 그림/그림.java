
import java.util.*;
import java.io.*;

public class Main{
    static int[] dy = {-1,0,1,0};
    static int[] dx = {0,-1,0,1};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =  Integer.parseInt(st.nextToken()); //y
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Queue<int[]> q = new LinkedList<>();
        int maxValue = 0;
        int countPicture = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j]){
                    if(map[i][j] == 1){
                        int tempCount = 0;
                        countPicture +=1;
                        q.add(new int[]{i,j});
                        visited[i][j] = true;
                        while(!q.isEmpty()){
                            int[] current = q.poll();
                            tempCount++;
                            for(int z=0;z<4;z++){
                                int ny = current[0] + dy[z];
                                int nx = current[1] + dx[z];
                                if(ny<0||ny>=n||nx<0||nx>=m){
                                    continue;
                                }
                                if(map[ny][nx] == 1 && !visited[ny][nx]){
                                    q.add(new int[] {ny,nx});
                                    visited[ny][nx] = true;
                                }
                            }
                        }
                        maxValue = Math.max(maxValue,tempCount);
                    }
                }
            }
        }
        System.out.println(countPicture);
        System.out.println(maxValue);

    }
}
