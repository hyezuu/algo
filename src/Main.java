import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        T.solution(n);
    }
    public void solution(int n) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a=1, b=1, c;
        bw.write(a+" "+b+" ");
        for(int i=2; i<n; i++){
            c=a+b;
            bw.write(c+" ");
            a=b;
            b=c;
        }
        bw.flush();
    }
}
