import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);
        int n = Integer.parseInt(br.readLine());

        int lt = str.length();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char c = s.charAt(0);
            if (c == 'L') lt--;
            else if (lt > 0 && c == 'B') {
                sb.deleteCharAt(lt-1);
                lt--;
            } else if (c == 'D') lt++;
            else if (c == 'P') {
                sb.insert(lt, s.charAt(2));
                lt++;
            }
            if (lt < 0) lt = 0;
            else if (lt > sb.length()) lt = sb.length();
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
