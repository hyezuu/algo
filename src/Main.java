import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//stack -> last in first out
public class Main {
    public String solution(String input) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        int cnt = 0;
        for(int i=0 ;i<input.length(); i++){
            if(input.charAt(i)=='('){
                stack.push('(');
            }
            else {
                stack.pop();
                if(input.charAt(i-1)=='('){
                    answer+=stack.size();
                }
                else {
                    answer++;
                }
            }
        }
        return answer+"";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        bw.write(T.solution(input));
        bw.flush();
    }
}