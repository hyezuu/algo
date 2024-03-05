import java.io.BufferedReader;
import java.io.InputStreamReader;
//자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요
//재귀함수는 스택프레임을 사용한다!


public class Main {
    public void DFS(int n){//dfs -> 깊이우선탐색, recursive
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        T.DFS(n);
    }
}
/*
|             매개변수(n)           |
|      지역변수(함수내에선언된 변수)     |
|             복귀주소              | D(1)
----------------------------------
|             매개변수(n)           |
|      지역변수(함수내에선언된 변수)     |
|             복귀주소              | D(2)
----------------------------------
|             매개변수(n)           |
|      지역변수(함수내에선언된 변수)     |
|             복귀주소              | D(3)
----------------------------------
재귀함수 동작 == 스택프레임의 구조..!?(구글링)
 */