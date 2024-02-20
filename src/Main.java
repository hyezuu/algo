import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public String solution(String need, String plan) {
        Queue<Character> q = new LinkedList<>();
        for (char x : need.toCharArray()) q.offer(x);
        for (char a : plan.toCharArray()) {
            if (q.contains(a)) {
                if (q.poll() != a) return "NO";//순서가 다른경우
            }
        }
        if(!q.isEmpty()) return "NO";
        return "YES";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String need = br.readLine();
        String plan = br.readLine();
        bw.write(T.solution(need, plan));
        bw.flush();
    }
}