import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] numsA = new int[n];
        int[] numsB = new int[n];

        StringTokenizer stkA = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            numsA[i] = Integer.parseInt(stkA.nextToken());
        }
        StringTokenizer stkB = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            numsB[i] = Integer.parseInt(stkB.nextToken());
        }
        bw.write(T.solution(n, numsA,numsB));
        bw.flush();
    }
    public String solution(int n, int[] numsA, int[]numsB){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n ;i++){
            if(numsA[i]==numsB[i]){
                sb.append('D').append("\n");
            } else if (numsA[i]==1&&numsB[i]==3) sb.append('A').append("\n");
             else if (numsA[i]==2&&numsB[i]==1) sb.append('A').append("\n");
             else if (numsA[i]==3&&numsB[i]==2) sb.append('A').append("\n");
             else sb.append('B').append("\n");
        }
        return sb.substring(0,sb.length()-1);
    }
}
