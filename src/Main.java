import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public boolean minD(int[] arr, int capacity, int c){
        Arrays.sort(arr);
        int cnt = 1, sum= arr[0];
        for(int i=1; i<arr.length; i++){
            if(sum+capacity<=arr[i]){
                cnt++;
                sum = arr[i];
            }
            if(cnt>=c)return true;
        }
        return false;
    }
    public int solution(int c, int[] arr){
        int answer = 0;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int lt = 1;
        int rt = max-min;

        while (lt<=rt){
            int mid = (lt+rt)/2;
            if(minD(arr, mid, c)){
                answer = mid;
                lt = mid+1;
            }
            else rt = mid-1;
        }
        return answer;
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int c = Integer.parseInt(stk.nextToken());
        StringTokenizer nums = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(nums.nextToken());
        }
        bw.write(T.solution(c , arr)+"");
        bw.flush();
    }
}
