import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] map = new int[n + 1][n + 1];
            boolean[][] visited = new boolean[n + 1][n + 1];
            List<int[]>[][] light = new ArrayList[n + 1][n + 1];

            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int tx = sc.nextInt();
                int ty = sc.nextInt();
                if (light[y][x] == null) {
                    light[y][x] = new ArrayList<>();
                }
                light[y][x].add(new int[]{ty, tx});
            }
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{1, 1});
            visited[1][1] = true;

            while (!q.isEmpty()) {
                int[] cur = q.poll();
                map[cur[0]][cur[1]] = 1;
                List<int[]> lights = light[cur[0]][cur[1]];
                if (lights != null) {
                    for (int[] e : lights) {
                        map[e[0]][e[1]] = 1;
                        if (visited[e[0]][e[1]]) {
                            continue;
                        }
                        for (int i = 0; i < 4; i++) {
                            int nx = e[1] + dx[i];
                            int ny = e[0] + dy[i];
                            if (checkBound(nx, ny, n) && visited[ny][nx]) {
                                q.add(new int[]{e[0], e[1]});
                                visited[e[0]][e[1]] = true;
                            }
                        }
                    }
                }
                for (int i = 0; i < 4; i++) {
                    int nx = cur[1] + dx[i];
                    int ny = cur[0] + dy[i];
                    if (checkBound(nx, ny, n) && !visited[ny][nx] && map[ny][nx] == 1) {
                        q.add(new int[]{ny, nx});
                        visited[ny][nx] = true;
                    }
                }
            }
            int result = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (map[i][j] == 1) {
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }

    static boolean checkBound(int x, int y, int n) {
        return x > 0 && x <= n && y > 0 && y <= n;
    }
}
