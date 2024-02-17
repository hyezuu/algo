import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n, String str) {
        char answer =' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
//            System.out.println(x+" "+map.get(x));
            if(map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
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