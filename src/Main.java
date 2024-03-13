import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
상태트리
입력 5, 14
5 14

0 : 5
1 : 6 10 4
2 : 7 11 15

answer : 3
 */
public class Main {
    int[] dis = {1,-1,5};
    boolean[] ch;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e) {
        ch = new boolean[10001];
        ch[s] = true;
        Q.offer(s);
        int L=0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0;i<len;i++){
                int x = Q.poll();
                for(int j=0; j<3; j++){
                    int nx = x+dis[j];
                    if(nx==e) return L+1;
                    if(nx>=1 && nx<=10000 && !ch[nx]){
                        ch[nx]= true;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(stk.nextToken());
        int e = Integer.parseInt(stk.nextToken());
        System.out.print(T.BFS(s,e));
    }
}
