import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(T.solution(n));
        bw.flush();
    }
    public String solution(int n){
        int count = 0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                count++;
                for(int j=i; j<=n; j=j+i){//j는 i의 배수만큼 증가하니까. i씩 증가!
                    ch[j] = 1;
                }
            }
        }
        return count+"";
    }
}
