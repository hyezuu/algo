import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(String str, String str1) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        int lt =0, cnt=0;
        for(char c : str1.toCharArray()){
            map1.put(c ,map1.getOrDefault(c,0)+1);
        }
        for(int rt =0; rt<str.length(); rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            if(rt-lt+1==str1.length()){
                if(map1.equals(map)){
                    cnt++;
                }
                map.put(arr[lt],map.get(arr[lt])-1);
                if(map.get(arr[lt])==0) map.remove(arr[lt]);
                lt++;
            }
        }
        return cnt+"";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String str1 = br.readLine();
        bw.write(T.solution(str, str1));
        bw.flush();
    }
}