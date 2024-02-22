import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public String solution(int n ,int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<n; i++){
            int tmp = arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp)arr[j+1]=arr[j];
                else break;
            }
            arr[j+1] = tmp;
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
