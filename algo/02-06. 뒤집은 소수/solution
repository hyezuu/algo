import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(stk.nextToken());
        }
        bw.write(T.solution(n, nums));
        bw.flush();
    }
    public String solution(int n, int[] nums){
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<n ;i++){
            int rvs = Integer.parseInt(sb.append(nums[i]).reverse().toString());
            boolean isPrime = true;
            for(int j=1; j<=Math.sqrt(rvs);j++){
                if((j!=1 && rvs%j==0) || rvs==1){
                    isPrime=false;
                }
            }
            if(isPrime){
                answer.append(rvs).append(" ");
            }
            sb.setLength(0);
        }
        return answer.substring(0,answer.length()-1);
    }
}
