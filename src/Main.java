import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public String solution(int n, int[] nums){
        Arrays.sort(nums);
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1])return "D";
        }
        return "U";
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer fn = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(fn.nextToken());
        }

        System.out.print(T.solution(n, nums));
    }
}
