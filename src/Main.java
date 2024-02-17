import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(String str1, String str2) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
        }
        if(map1.size()==map2.size()){
            for(char key : map1.keySet()){
                if(!map1.get(key).equals(map2.get(key))){
                    return "NO";
                }
            }
        }
        else return "NO";
        return "YES";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = br.readLine();
        String str2 = br.readLine();
        bw.write(T.solution(str1, str2));
        bw.flush();
    }
}
