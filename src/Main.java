import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public String solution(String s, String str) {
        Queue<Character> q = new LinkedList<>();
        for(char x:s.toCharArray()){
            q.offer(x);
        }
        for(char a :str.toCharArray()){
            if(q.peek()==a){
                q.poll();
                if(q.isEmpty()){
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String str = br.readLine();
        bw.write(T.solution(s, str));
        bw.flush();
    }
}