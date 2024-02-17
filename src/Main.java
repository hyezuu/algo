import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(String a, String b) {
        HashMap<Character, Integer> bm = new HashMap<>();
        HashMap<Character, Integer> am = new HashMap<>();
        for (char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);
        int lt = 0, cnt = 0, len = b.length() - 1;
        for (int i = 0; i < len; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }
        for (int rt = len; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            if (am.equals(bm)) cnt++;
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
            if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
            lt++;
        }
        return cnt + "";
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