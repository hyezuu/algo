import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
경로 탐색(인접행렬)

방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
아래 그래프에서 1번 정점으로 가는 가지 수는

1 2 3 4 5               1<---- >2----->5
1 2 5                   |\     /^    ^
1 3 4 2 5               | \   / |   /
1 3 4 5                 |   V   |  /
1 4 2 5                 |  / \  | /
1 4 5                   V v   v |/
                        3------>4

총 6가지 입니다.

입력설명

첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.

출력 설명

총 가지수를 출력한다.

입력예제 1
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5

출력예제 1
6
 */
public class Main {
    static int[][] graph;
    static boolean[] chk;
    static int N, M, answer=0;
    public void DFS(int V) {
        if(V==N) answer++;
        else {
            for(int i=1; i<=N; i++){
                if(graph[V][i]==1&&!chk[i]){
                    chk[i]=true;
                    DFS(i);
                    chk[i]=false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());

        graph = new int[N + 1][N + 1];
        chk = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            StringTokenizer stk1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk1.nextToken());
            int b = Integer.parseInt(stk1.nextToken());
            graph[a][b] = 1;
        }
        chk[1]=true;
        T.DFS(1);
        System.out.println(answer);
    }
}
