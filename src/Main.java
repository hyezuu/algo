import java.io.BufferedReader;
import java.io.InputStreamReader;
//자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요

public class Main {
    public int DFS(int n){//dfs -> 깊이우선탐색, recursive
        if(n==1) return 1;
        else return n*DFS(n-1);
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(T.DFS(n));
    }
}
/*
D(5)
 5*D(4) 5*4*3*2*1 리턴 후 pop
   4*D(3) 4*3*2*1 리턴 후 pop
     3*D(2) 3*2*1 리턴 후 pop
      2*D(1)  2*1 리턴 후 pop
       1 --> return 1 (다시 위로)
 */