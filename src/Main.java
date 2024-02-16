import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n) {
        int cnt = 0, sum=0, lt=0;
        int m=n/2+1;
        int[] arr = new int[m];
        for(int i=0; i<m; i++) arr[i] = i+1;
        for(int rt = 0; rt<m; rt++){
            sum+=arr[rt];
            if(sum == n) cnt++;
            while (sum>=n){
                sum-=arr[lt++];
                if(sum==n) answer++
            }
        }
        return cnt+"";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(T.solution(n));
        bw.flush();
    }
}