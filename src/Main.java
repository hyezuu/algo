import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public String solution(int n ,int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<n; i++){
            int tmp = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev]>tmp){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]=tmp;
        }
        for(int a : arr){
            sb.append(a).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        bw.write(T.solution(n, arr));
        bw.flush();
    }
}
