import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
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
        for(int i : T.solution(n, nums)){
            bw.write(i+ " ");
        }
        bw.flush();
    }
    public ArrayList<Integer> solution(int n, int[] nums){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n ;i++){
            int tmp = nums[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res*10+t;
                tmp= tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }
    public boolean isPrime(int num){
        if(num == 1) return false;
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
