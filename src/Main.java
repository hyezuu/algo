import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public String solution(int n, int m, int[][] arr) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i!=j){
                    int cnt = 0;
                    for(int k=0; k<m; k++){
                        int pi=0, pj=0;
                        for(int s=0; s<n; s++){
                            if(arr[k][s]==i) pi =s;
                            if(arr[k][s]==j) pj =s;
                        }
                        if(pi<pj) cnt++;
                    }
                    if(cnt == m){
                        answer++;
                    }
                }
            }
        }
        return answer+"";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer nums = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(nums.nextToken());
        int m = Integer.parseInt(nums.nextToken());
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        bw.write(T.solution(n, m, arr));
        bw.flush();
    }
}
