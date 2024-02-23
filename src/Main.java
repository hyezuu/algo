import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public String solution(int n, int[] nums){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n-1; i++){
            int idx = i;
            for(int j=n-1;j>=i+1; j--){
                if(nums[j]<nums[idx]){
                    idx = j;
                }
            }
            if(idx!=i){
                sb.append(i+1).append(" ").append(idx+1);
                break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer lines = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(lines.nextToken());
        }

        System.out.print(T.solution(n, nums));
    }
}
