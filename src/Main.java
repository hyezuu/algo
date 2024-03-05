import java.io.BufferedReader;
import java.io.InputStreamReader;
//자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요

public class Main {
    public void DFS(int n, int multi){//dfs -> 깊이우선탐색, recursive
        if(n==0) {
            System.out.print(multi);
        }
        else{
            multi*=n;
            DFS(n-1,multi);
        }
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        T.DFS(n,1);
    }
}