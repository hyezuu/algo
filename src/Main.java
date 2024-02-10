import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public String solution(int n, int[][] nums) {
        int answer = 0, max = Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(nums[i][k]==nums[j][k]){
                        cnt++;
                        break;
                    }
                }
            }//i학생 고정, j학생과 k를올리면서 비교한다
            //j학생과 전 학년 중 한번이라도 같은 반이었던 적이있으면 count를 올림
            //break를 거는 이유는 같은 학생과 두번 카운팅되면 안되기 때문이다
            //문제이해도 수준 실화냐
            if(cnt>max){
                max = cnt;
                answer = i;
            }
        }
        return answer+"";
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] nums = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++) {
                nums[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        bw.write(T.solution(n, nums));
        bw.flush();
    }
}
