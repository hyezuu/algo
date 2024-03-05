import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요
public class Main {
    public void solution(int i,int n){
        if(i>n) return;
        else {
            System.out.print(i+" ");
            solution(i+1, n);
        }
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        T.solution(1,n);
    }
}
