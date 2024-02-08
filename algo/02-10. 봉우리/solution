import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int[][] nums = new int[n + 2][n + 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        bw.write(T.solution(n, nums));
        bw.flush();
//        System.out.println("");
//        for(int i=0; i<=n+1; i++){
//            for(int j=0; j<=n+1; j++){
//                System.out.print(nums[i][j]+" ");
//            }
//            System.out.println("");
//        }
    }

    public String solution(int n, int[][] nums) {
        int[] aroundX = {-1, 0, 0, 1};
        int[] aroundY = {0, 1, -1, 0};
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                boolean isBigger = true;
                for (int k = 0; k < 4; k++) {
                    if (nums[i][j] <= nums[i + aroundX[k]][j + aroundY[k]]) {
                        isBigger = false;
                        break;
                    }
                }
                if (isBigger) answer++;

            }
        }
        return answer + "";
    }
}
