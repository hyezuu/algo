import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public String solution(int n, int[][] nums){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int idx = i;
            for(int j=i+1; j<n; j++){
                if(nums[idx][0]>nums[j][0]){
                    idx=j;
                }
                else if(nums[idx][0]==nums[j][0]&&nums[idx][1]>nums[j][1]){
                    idx=j;
                }
            }
            int[] tmp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = tmp;
        }
        for(int[] arr : nums){
            sb.append(arr[0]).append(" ").append(arr[1]).append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] nums = new int[n][2];
        for(int i=0; i<n; i++){
            StringTokenizer lines = new StringTokenizer(br.readLine());
            nums[i][0] = Integer.parseInt(lines.nextToken());
            nums[i][1] = Integer.parseInt(lines.nextToken());
        }

        System.out.print(T.solution(n, nums));
    }
}
