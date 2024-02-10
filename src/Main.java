import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int[][] nums = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        bw.write(T.solution(n, nums));
        bw.flush();
    }
    public String solution(int n, int[][] nums){
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1+=nums[i][j];//i==행번호, j==열번호 (열 변하고 행 고정 -> 행의 총합)
                sum2+=nums[j][i];//j==행번호, i==열번호 (행 변하고 열 고정 -> 열의 총합)
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){//대각선 합 구하기
            sum1+=nums[i][i];
            sum2+=nums[i][n-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer+"";
    }
}
