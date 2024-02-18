import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
//stack -> last in first out
public class Main {

    public String solution(String input) {
      Stack<Character> st = new Stack<>();
      for(int i=0; i<input.length(); i++){
          if(input.charAt(i)=='('){
              st.push('(');
          }
          else {
              if(st.isEmpty()) return "NO";
              else st.pop();
          }
      }
      if(!st.isEmpty()){
          return "NO";
      }
      else return "YES";
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