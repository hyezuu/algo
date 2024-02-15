import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n, int m, int[] arr) {
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum==m){
                    cnt++;
                    break;
                }
                else if(sum>m) break;
            }
        }
        return cnt+"";
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