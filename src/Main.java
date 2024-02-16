import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n) {
        int cnt = 0, sum=0, lt=1 , rt=1;
        while (lt<n/2+1){
            if(sum>n){
                sum-=lt++;
            }
            else sum+=rt++;
            if(sum==n) {
                cnt++;
                sum-=lt++;
            }
        }
        return cnt+"";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(T.solution(n));
        bw.flush();
    }
}