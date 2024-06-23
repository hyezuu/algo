import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//백준 계단오르기
class Main {
    public static void main(String[] args) throws IOException {

        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] arr = new int[t+1];

        for (int i = 1; i < t+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(main.solution(t, arr));
        br.close();
    }
    public int solution(int n, int[] arr) {
        int sum = 0;
        if(n<=2) {
            for(int a : arr){
                sum+=a;
            }
            return sum;
        }
        int[] dp = new int[n+1];
        sum = arr[1]+arr[2]+arr[3];
        dp[1] = arr[1];
        dp[2] = arr[2];
        dp[3] = arr[3];
        for(int i=4; i<=n; i++){
            sum += arr[i];
            dp[i] = Math.min(dp[i-2], dp[i-3]) + arr[i];
        }

        return sum-Math.min(dp[n-1], dp[n-2]);
    }

//    public int solution(int t, int[] arr) {
//        if(t==1) return arr[1];
//        //dp[i][j] : 현재까지 j개의 계단을 연속해서 밟고, i번째 계단까지 올라섰을때
//        //점수합의 최댓값. 단 i번째 계단은 반드시 밟아야 함
//        int[][] dp = new int[t+1][3];
//
//        dp[1][1] = arr[1];
//        dp[1][2] = 0;
//        dp[2][1] = arr[2];
//        dp[2][2] = arr[1]+arr[2];
//
//        for(int i=3; i<=t; i++){
//            //현재까지 1개의 계단을 연속해서 밟은 경우 -> 이전에 jump 한 경우 (두칸 전에서의 최댓값)
//            dp[i][1] += Math.max(dp[i-2][1], dp[i-2][2])+arr[i];
//            //현재까지 두개의 계단을 연속해서 밟은경우 -> 이전에 go 한경우 && 이전에 1개까지만 밟은경우
//            dp[i][2] += dp[i-1][1]+arr[i];
//        }
//        return Math.max(dp[t][1], dp[t][2]);
//    }
}

//프로그래머스 완주하지못한선수
