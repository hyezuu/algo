import java.io.BufferedReader;
import java.io.InputStreamReader;
//자연수 N이 입력되면 N 번째까지의 피보나치 수열을 출력하는 프로그램을 작성하세요

public class Main {
    public int DFS(int n){//dfs -> 깊이우선탐색, recursive
        if(n==1) return 1;
        else if(n==2) return 1;
        else return DFS(n-2)+DFS(n-1);
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<n; i++){
            System.out.print(T.DFS(i)+" ");
        }
    }
}
/*
          D(5) ==> 2+3 == 5
      D(3) + D(4)
  D(1)+D(2)  D(2)+D(3)
   1    1     1 + D(1)+D(2)
                    1 + 1
 */