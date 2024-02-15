import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n, int k, int[] arr) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=n-k; i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i; j<i+k; j++){
                set.add(arr[j]);
            }
            sb.append(set.size()).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer cond = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(cond.nextToken());
        int k = Integer.parseInt(cond.nextToken());
        int[] arr = new int[n];
        StringTokenizer days = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i]= Integer.parseInt(days.nextToken());
        }
        bw.write(T.solution(n, k, arr));
        bw.flush();
    }
}