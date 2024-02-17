import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(String a, String b) {
        HashMap<Character, Integer> bm = new HashMap<>();
        HashMap<Character, Integer> am = new HashMap<>();
        char[] arr = a.toCharArray();
        int lt =0, cnt=0;
        for(char c : b.toCharArray()){
            bm.put(c ,bm.getOrDefault(c,0)+1);
        }
        for(int i =0; i<b.length()-1; i++){
            am.put(arr[i],am.getOrDefault(arr[i],0)+1);
        }
        for(int rt = b.length()-1; rt<a.length(); rt++){
            am.put(arr[rt], am.getOrDefault(arr[rt],0)+1);
            if(am.equals(bm)){
                cnt++;
            }
            if(am.get(arr[lt])>1){
                am.put(arr[lt], am.get(arr[lt])-1);
            }
            else am.remove(arr[lt]);
            lt++;
        }
        return cnt+"";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = br.readLine();
        String b = br.readLine();
        bw.write(T.solution(a, b));
        bw.flush();
    }
}