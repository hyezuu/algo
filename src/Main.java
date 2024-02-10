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
        for(int x : T.solution(n, nums)){
            bw.write(x+" ");
        }
        bw.flush();
    }
    public ArrayList<Integer> solution(int n, int[] nums){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(nums[0]);
        for(int i=1; i<n; i++){
            if(nums[i]>nums[i-1]){
                answer.add(nums[i]);
            }
        }
        return answer;
    }
}
