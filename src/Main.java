import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

//stack -> last in first out
public class Main {
    public String solution(String input) {
        int rs = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x :input.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(Character.getNumericValue(x));
            }
            else{
                int a = stack.pop();
//                System.out.println("a : " + a);
                int b = stack.pop();
//                System.out.println("b : " + b);
                if (x=='+'){
//                    System.out.println( "b: " +b +" a : "+ a +"= a+b" + (a+b));
                    stack.push(b + a);
                }
                else if (x=='-'){
//                    System.out.println( "b: " +b +" a : "+ a +"= a-b" + (b-a));
                    stack.push(b - a);
                }
                else if (x=='*'){
//                    System.out.println( "b: " +b +" a : "+ a +"= a*b" + a*b);
                    stack.push(b * a);
                }
                else if (x=='/'){
//                    System.out.println( "b: " +b +" a : "+ a +"= a/b" + a/b);
                    stack.push(b / a);
                }
            }
        }
        return stack.peek()+"";
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