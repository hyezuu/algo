import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n, int k, int[] arr) {
        int max = 0;
        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=i; j<n; j++){
                if(arr[j]==0){
                    cnt++;
                }
                if (cnt>k){
                    if(max<j-i){
                        max = j-i;
                    }
                    break;
                }
            }
        }
        return max+"";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer con = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(con.nextToken());
        int k = Integer.parseInt(con.nextToken());
        StringTokenizer nums = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(nums.nextToken());
        }
        bw.write(T.solution(n, k , arr));
        bw.flush();
    }
}