import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

//stack -> last in first out
public class Main {
    public String solution(int n, int[][] arr, int m, int[] move) {
        Stack<Integer> basket = new Stack<>();
        int cnt = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[j][move[i]-1]!=0){
                    if(!basket.isEmpty()&&arr[j][move[i]-1]==(basket.peek())){
                        basket.pop();
                        cnt++;
                    }
                    else basket.push(arr[j][move[i]-1]);
                    arr[j][move[i]-1]=0;
                    break;
                }
            }
        }
        return cnt*2+"";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i=0 ;i<n; i++){
            StringTokenizer arrs = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(arrs.nextToken());
            }
        }
        int m = Integer.parseInt(br.readLine());
        StringTokenizer moves = new StringTokenizer(br.readLine());
        int[] move = new int[m];
        for(int i=0; i<m; i++){
            move[i] = Integer.parseInt(moves.nextToken());
        }

        bw.write(T.solution(n, arr, m, move));
        bw.flush();
    }
}