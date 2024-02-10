import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public String solution(int n, int[][] nums) {
        int[] stu = new int[n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for(int k= 1; k<=5; k++){
                    if(nums[i][k]==nums[j][k]){
                        stu[i]++;
                        stu[j]++;
                        break;//없으면 안된다..ㅠ
                        // 왜냐면 3번4번 , 3,5 번 이런식으로해야하는데 너무 여러번 카운팅됨
                    }
                }
            }
        }
        int max = 0;
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(stu[i]>max){
                max = stu[i];
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
        for (int i = 1; i < n+1; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for (int j = 1; j < 6; j++) {
                nums[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        bw.write(T.solution(n, nums));
        bw.flush();
    }
}
