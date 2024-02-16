import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public String solution(int n) {
        int answer=0, cnt=1;
        n--;//n=n-1;
        while (n>0){
            cnt++;//cnt==2
            n=n-cnt;//n=n-2;(1,2를뺐음)
            if(n%cnt==0){
                answer++;
            }
        }
        return answer+"";
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