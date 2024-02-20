import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public String solution(String s, String str) {
        Queue<Character> q = new LinkedList<>();
        int lt =0;
        for(char x :str.toCharArray()){
            if(x==s.charAt(lt)){
                if(lt<s.length()-1){
                    lt++;
                }
                else return "YES";
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