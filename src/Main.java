import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
이진트리 순회(넓이우선탐색 : 레벨탐색)
루트에서 특정 지점으로 갈 때의 최단거리
queue를 사용한다 !(dfs는 스택)
        1           0레벨
 (왼)2     (오)3     1레벨(루트에서 한번만에 갈 수 있는 노드들)
 4    5    6   7    2레벨(루트에서 두번만에 갈 수 있는 노드들)

레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
 */
public class Main {
    static int E;
    static boolean[] chk;

    public void BFS(int root, int L) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(root);
        chk[root] = true;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int tmp = Q.poll();

                if(tmp+1==E||tmp+5==E||tmp-1==E) {
                    System.out.print(L+1);
                    return;
                }
                else {
                    if (!chk[tmp + 1]) {
                        Q.offer(tmp + 1);
                        chk[tmp + 1] = true;
                    }
                    if (!chk[tmp + 5]) {
                        Q.offer(tmp + 5);
                        chk[tmp + 5] = true;
                    }
                    if (tmp-1>0&&!chk[tmp - 1]) {
                        Q.offer(tmp - 1);
                        chk[tmp - 1] = true;
                    }
                }

            }
            L++;
        }
    }

    public static void main(String[] args) throws IOException {
        Main tree = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(stk.nextToken());
        E = Integer.parseInt(stk.nextToken());
        chk = new boolean[20000];
        tree.BFS(S, 0);
    }
}
