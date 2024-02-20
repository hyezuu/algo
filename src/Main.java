import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//FIFO First, in first out
//추가 -> offer, 꺼내기 -> poll  , q.contains(x)
public class Main {
    public String solution(int n, int k) {
        String answer = "";
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) q.offer(i);
        int a, cnt = 0;
        while (!q.isEmpty()) {
            for (int i = 1; i < k; i++) q.offer(q.poll());
            //k==3이면 , 2번까지는 offer
            q.poll();
            if (q.size()==1) answer=q.poll()+"";
        }
        return answer;
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
