import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

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
        for(int a : T.solution(n, nums)){
            bw.write(a+" ");
        }
        bw.flush();
    }
    public int[] solution(int n, int[] nums) {
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            answer[i] = 1;
            for(int j=0; j<n; j++){
                if(nums[j]>nums[i]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
