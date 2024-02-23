import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public String solution(int[] arr, int m){
        Arrays.sort(arr);
        int min = 0;
        int max = arr.length-1;
        int mid;
        while (min<max){
            mid = (min+max)/2;
            if(arr[mid]==m) return mid+1+"";
            else if(arr[mid] > m) max=mid-1;
            else min=mid+1;
        }
        return "-1";
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer cond = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(cond.nextToken());
        int m = Integer.parseInt(cond.nextToken());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        bw.write(T.solution(arr, m));
        bw.flush();
    }
}
