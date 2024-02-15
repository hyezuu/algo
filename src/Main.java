import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public String solution(int n, int k, int[] arr) {
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        int mem = 0;

        for(int i=0; i<k; i++){
            if(!set.add(arr[i])){
                mem = i;
            }
        }
        sb.append(set.size()).append(" ");
        for(int i=k-1; i<n; i++){
            if(i-k+1!=mem) set.remove(arr[i-k+1]);
            if(!set.add(arr[i])) mem = i;
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
        StringTokenizer days = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= Integer.parseInt(days.nextToken());
        }
        bw.write(T.solution(n, k, arr));
        bw.flush();
    }
}