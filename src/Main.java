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
        //System.out.println(map.containsKey('F')); //메서드 연습용
//        System.out.println("     초기 map 크기 : "+map.size()); //메서드 연습용(사이즈)
//        System.out.println("    'A' 제거, 밸류 : "+ map.remove('A'));
//        System.out.println("remove 실행 후 크기 : "+map.size());

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
        //System.out.println(key+" "+map.get(key));
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