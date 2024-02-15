import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n, String str) {
        int max = 0;
        char answer = '0';
        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            Integer i = map.getOrDefault(c,0);
            i++;
            if(i>max){
                max = i;
                answer = c;
            }
            map.put(c, i);
        }
        return answer+"";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        bw.write(T.solution(n, str));
        bw.flush();
    }
}