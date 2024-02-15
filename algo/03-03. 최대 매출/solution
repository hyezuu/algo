import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n, int m, int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += arr[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max + "";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer con = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(con.nextToken());
        int m = Integer.parseInt(con.nextToken());
        StringTokenizer cnt = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(cnt.nextToken());
        }

        bw.write(T.solution(n, m, arr));
        bw.flush();
    }
}