import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public String solution(int n, int[] nums){
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = nums.clone();
        Arrays.sort(tmp);
        for(int i=0; i<n; i++){
            if(nums[i]!=tmp[i]) answer.add(i+1);
        }
        for(int x : answer){
            sb.append(x).append(" ");
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
