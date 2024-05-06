import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char c = br.readLine().charAt(0);
        System.out.println(T.solution(str, c));
    }
    public int solution (String str , char c){
        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        int cnt = 0;
        for(char a : str.toCharArray()){
            if(a==c) cnt++;
        }
        return cnt;
    }
}