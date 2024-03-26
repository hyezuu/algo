import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

/*
그래프 최단거리 (BFS)

다음 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요

 1<------2----->5
 | \      ^     ^
 |  \      \   /|
 |   \       V  |
 |    \     / \ |
 V      v  /   \|
 3------>4----->6

입력설명
첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.

출력 설명
1번 정점에서 각 정점으로 가는 최소 간선수를 2번 정점부터 차례대로 출력하세요.

입력예제 1
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5

출력예제 1
2 : 3
3 : 1
4 : 1
5 : 2
6 : 2

 */
public class Main {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int s = query[0], e = query[1], k = query[2];
            for(int i=s; i<=e; i++){
                if(arr[i]%k==0) arr[i]++;
                System.out.println("!@#$%^&*(\\'\"<>?:;");
            }
            Arrays.copyOfRange()
        }
        Long.MAX_VALUE
        String my_string = "hello";
        String str = "11423849239827498274928749283948273498274";
        BigInteger bigInteger = new BigInteger(str);
        bigInteger.add()
        for(char c : my_string.toCharArray()){
            if(Character.isUpperCase(c))
        }
        int a = b= 0;
        return arr;
        String str = "11423849239827498274928749283948273498274";
        BigInteger bigInteger = new BigInteger(str)
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            graph.get(a).add(b);
        }
        chk = new boolean[N + 1];
        dis = new int[N + 1];
        T.BFS(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}