import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n, int m, int[] arr) {
        int answer= 0, sum=0, lt=0;
        for(int rt=0; rt<n; rt++){
            sum+=arr[rt];
            if(sum==m)answer++;

            while (sum>=m){
                sum-=arr[lt++];//같을때 이거 수행하면 빼고 lt++,rt++ 수행
                if(sum==m) answer++;
            }
        }
        return answer+"";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer con = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(con.nextToken());
        int m = Integer.parseInt(con.nextToken());
        StringTokenizer cnt = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(cnt.nextToken());
        }
        bw.write(T.solution(n, m, arr));
        bw.flush();
    }
}