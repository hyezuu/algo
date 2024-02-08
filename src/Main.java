import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Integer[] nums = new Integer[n];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(stk.nextToken());
        }
        bw.write(T.solution(n, nums));
        bw.flush();
    }
    public String solution(int n, Integer[] nums){
        Integer[] rank = Arrays.copyOf(nums, n);
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(rank, Comparator.reverseOrder());
        map.put(rank[0], 1);
        for(int i=1; i<n ; i++){
            if(rank[i]==rank[i-1]){
                map.put(rank[i], map.get(rank[i-1]));
            }
            else {
                map.put(rank[i], i+1);
            }
        }
        for(int i=0; i<n; i++){
            sb.append(map.get(nums[i])).append(" ");
        }
        return sb.substring(0, sb.length()-1);
    }
}
