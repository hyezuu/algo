import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(T.solution(n));
        bw.flush();
    }
    public String solution(int n){
        StringBuilder sb = new StringBuilder();
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 1;
        for(int i=2; i<n ;i++){
            nums[i] = nums[i-1]+nums[i-2];
        }
        for(int num : nums){
            sb.append(num).append(" ");
        }
        return sb.substring(0,sb.length()-1);
    }
}
