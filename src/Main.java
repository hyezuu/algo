import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n) {
        int cnt = 0;

        for(int i=1; i<=(n/2)+1; i++){
            int sum=0;
            for(int j=i; j<=(n/2)+1 ;j++){
                sum+=j;
                if(sum == n){
                    cnt++;
                    break;
                }
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