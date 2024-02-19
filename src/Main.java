import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//stack -> last in first out
public class Main {
    public String solution(String input) {
        Stack<Integer> stack = new Stack<>();
        for(char x :input.toCharArray()){ //문자는 기본적으로 정수형타입이니까. 변환해줘야함
            if(Character.isDigit(x))stack.push(x-'0');//||x-48

            else{
                int rt = stack.pop();
                int lt = stack.pop();
                if (x=='+')stack.push(lt + rt);
                else if (x=='-')stack.push(lt - rt);
                else if (x=='*')stack.push(lt * rt);
                else if (x=='/')stack.push(lt / rt);
            }
        }
//        return stack.peek()+"";
        return stack.get(0)+"";
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
//(Character.getNumericValue(x))