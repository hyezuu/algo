import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
경로 탐색(인접리스트)
정점갯수가 늘어나면 인접행렬은 비효율적이다! (N>=10000인 경우..for문을 엄청 돌면서 확인해야함)
공간복잡도, 시간복잡도가 너무너무 높아진다 ㅠㅠ

1번 리스트 add(2,3,4)
2번 리스트 add(1,3,5)
3번 리스트 add(4)
4번 리스트 add(2,5)
5번 리스트

graph[v][i]==1 ? 을 볼 필요가 없어서 효율적이다! (리스트 길이만큼만 돌면 됨)

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
    static int N, M, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] chk;
    public void DFS(int V) {
        if(V==N) answer++;
        else {
            for(int nv : graph.get(V)){
                if(!chk[nv]){
                    chk[nv]=true;
                    DFS(nv);
                    chk[nv]=false;
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

        graph = new ArrayList<ArrayList<Integer>>();
        chk = new boolean[N + 1];
        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<Integer>());
        }//0번부터 N번까지 생성한다!
        for (int i = 0; i < M; i++) {
            StringTokenizer stk1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk1.nextToken());
            int b = Integer.parseInt(stk1.nextToken());
            graph.get(a).add(b);
            //a번 arrayList에 b를 추가한다
        }
        chk[1]=true;
        T.DFS(1);
        System.out.println(answer);
    }
}
