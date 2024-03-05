import java.io.BufferedReader;
import java.io.InputStreamReader;

//메모이제이션 활용한 1초만에 뽑아내기
public class Main {
    static int[] fibo; //정적배열 선언해서 저장하는것
    public int DFS(int n){//dfs -> 깊이우선탐색, recursive
        if(fibo[n]>0) return fibo[n];
        if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2)+DFS(n-1);
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo = new int[n+1];
        T.DFS(n);
        for(int i=1; i<=n; i++){
            System.out.print(fibo[i]+" ");
        }
    }
}
