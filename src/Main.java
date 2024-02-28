import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public String solution (String str, ArrayList<String> list){
        int lt = list.size();
        ArrayList<Character> answer = new ArrayList<>();
        for(char x : str.toCharArray()){
            answer.add(x);
        }
        for(String s : list){
            char c = s.charAt(0);
            if(lt>0) {
                if(c=='L') lt--;
                else if(c=='B') answer.remove(lt);
            }
            else if (lt<answer.size()) {
                if(c=='D') lt++;
            }
            else if (c=='P') answer.add(lt, s.charAt(2));
        }

        return String.valueOf(answer);
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        bw.write(T.solution(str, list));
        bw.flush();
    }
}
