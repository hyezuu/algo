import java.io.*;
import java.util.*;

class Main {
    static int[] arr;
    static int n;
    static int m;
    static BufferedWriter bw;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        boolean[] check = new boolean[n+1];
        solution(0, check , 0);
        bw.flush();
        bw.close();
        br.close();
    }
    public static void solution(int idx, boolean[] check, int cnt) throws Exception {
        if(idx==n) return;
        if(cnt==m){
            for(int i=1; i<=n; i++){
                if(check[i]){
                    bw.write(i+" ");
                    cnt--;
                }
                if(cnt == 0) break;
            }
            bw.newLine();
            return;
        }
        check[idx]=true;
        solution(idx+1, check, cnt+1);
        check[idx]=false;
        solution(idx+1, check, cnt);
    }
}
