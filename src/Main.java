import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

//stack -> last in first out
public class Main {
    public String solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1]!=0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty()&&tmp == stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        return answer+"";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        for(int i=0 ;i<n; i++){
            StringTokenizer arrs = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                board[i][j] = Integer.parseInt(arrs.nextToken());
            }
        }
        int m = Integer.parseInt(br.readLine());
        StringTokenizer move = new StringTokenizer(br.readLine());
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i] = Integer.parseInt(move.nextToken());
        }

        bw.write(T.solution(board, moves));
        bw.flush();
    }
}