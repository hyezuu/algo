import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
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
            if(lt<arr[i])lt=arr[i];
            rt+=arr[i];
        }
        int answer = Integer.MAX_VALUE;
        while (lt<=rt){
            int mid = (lt+rt)/2;
            int sum = 0,i=0,cnt=1;
            while (i<arr.length){
                sum+=arr[i];
                if(sum>mid){
                    sum=arr[i];
                    cnt++;
                }
                i++;
            }
            if(cnt<=m) {
                rt=mid-1;
                answer = Math.min(mid,answer);
            }
            else lt=mid+1;
        }
        bw.write(answer+"");
        bw.flush();
    }
}
