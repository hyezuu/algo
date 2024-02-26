import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public int count(int[] arr, int capacity){
        int cnt = 1, sum=0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(sum+capacity>=arr[i]){
                cnt++;
            }
            else sum=arr[i];
        }
        return cnt;
    }
    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int lt = 1;
        int rt = max-min;

        while (lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid)>=m){
                answer = mid;
                rt = mid-1;
            }
            else lt = mid+1;
        }
        return answer;
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        StringTokenizer nums = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int lt = 0, rt = 0;
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(nums.nextToken());
        }
        bw.write(T.solution(n, m , arr)+"");
        bw.flush();
    }
}
