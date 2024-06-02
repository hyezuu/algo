import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer con = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(con.nextToken());
        int c = Integer.parseInt(con.nextToken());

        char[][] arr = new char[r][c];

        for (int i = 0; i < r; i++) {
            String line = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        System.out.print(main.solution(r, c, arr));
    }

    public String solution(int n, int m, char[][] arr) {
        Queue<int[]> q = new LinkedList<>();
        int[][] distance = new int[n][m];

        int[] jh = new int[2];
        int[] fire = new int[2];
        for (int i = 0; i < n; i++) {
            Arrays.fill(distance[i], -1);
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'J') {
                    jh[0] = i;
                    jh[1] = j;
                    distance[i][j] = 0;
                }
                if (arr[i][j] == 'K') {
                    fire[0] = i;
                    fire[1] = j;
                    distance[i][j] = 0;
                }
            }
        }
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        int min = Integer.MAX_VALUE;
        q.offer(fire);
        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp[0] + dx[i];
                int ny = tmp[1] + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == '.' && distance[nx][ny] == -1) {
                    q.offer(new int[]{nx, ny});
                    distance[nx][ny] = distance[tmp[0]][tmp[1]] + 1;
                }
            }
        }
        q.offer(jh);
        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp[0] + dx[i];
                int ny = tmp[1] + dy[i];
//                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
//                    if (distance[tmp[0]][tmp[1]] > 0) min = Math.min(min, distance[tmp[0]][tmp[1]] + 1);
//                    continue;
//                }
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == '.') {
                    if (distance[nx][ny] > distance[tmp[0]][tmp[1]] + 1) {
                        q.offer(new int[]{nx, ny});
                        distance[nx][ny] = distance[tmp[0]][tmp[1]] + 1;
                        if(nx == 0 || nx == n-1 || ny == 0 || ny == m-1){
                            min = Math.min(min, distance[nx][ny]+1);
                        }
                    } else distance[nx][ny] = -1;
                }
            }
        }
        return min == Integer.MAX_VALUE ? "IMPOSSIBLE" : min + "";
    }
}