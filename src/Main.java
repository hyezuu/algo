import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

//괄호-> 스택!!!!
public class Main {
    public String solution(int n, int k) {
        Queue<Integer> q  = new LinkedList<>();
        for(int i=1 ;i<=n; i++){
                q.offer(i);
            }
        int a, cnt=0;
        while (q.size()>1){
            a = q.poll();
            cnt++;
            if(cnt!=k){
                q.offer(a);
            }
            else cnt = 0;
        }
        return q.peek()+"";
        }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer cond = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(cond.nextToken());
        int k = Integer.parseInt(cond.nextToken());
        bw.write(T.solution(n, k));
        bw.flush();
    }
}