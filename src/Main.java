import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public String solution(int[] arr,int n,  int m){
        Arrays.sort(arr);
        String answer = "";
        int lt = 0, rt = n-1;
        while (lt<=rt){
            int mid = (lt+rt)/2;
            if(arr[mid]==m) {
                answer = mid+1+"";
                break;
            }
            else if(arr[mid] > m) rt=mid-1;
            //arr[mid] > m 이면 mid 보다 아래인덱스에 m이 존재하는것이다!
            else lt=mid+1;
        }
        return answer;
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
        bw.write(T.solution(arr,n,m));
        bw.flush();
    }
}
