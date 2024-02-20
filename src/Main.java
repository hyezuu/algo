import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public String solution(int n, int m, int[] arr) {
        StringBuilder sb = new StringBuilder();
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            int[] num = {i, arr[i]};
            q.offer(num);
        }
        Arrays.sort(arr);

        int rt= n-1, cnt=0;
        while (!q.isEmpty()){
            if(q.peek()[1]==(arr[rt])){
                cnt++;
                if(q.peek()[0]==m) {
                    sb.append(cnt);
                    break;
                }
                else {
                    q.poll();
                    rt--;
                }
            }
            else q.offer(q.poll());
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer cond = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(cond.nextToken());
        int m = Integer.parseInt(cond.nextToken());

        StringTokenizer nums = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(nums.nextToken());
        }
        bw.write(T.solution(n, m, arr));
        bw.flush();
    }
}