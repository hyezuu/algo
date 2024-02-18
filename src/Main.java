import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

//stack -> last in first out
public class Main {
    public String solution(String input) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : input.toCharArray()){
            if(x=='(') stack.push(x);
            else{
                if(stack.isEmpty())return "NO";//닫는게 더 많음
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";//여는게 더 많음
        return answer;
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