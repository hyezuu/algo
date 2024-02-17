import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n, int k, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int lt =0, max=0;
        for(int rt =0; rt<n; rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            if(rt-lt+1 == k){
                sb.append(map.size()).append(" ");
                if(map.get(arr[lt])>1){
                    map.put(arr[lt],map.get(arr[lt])-1);
                }
                else map.remove(arr[lt]);
                lt++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer con = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(con.nextToken());
        int k = Integer.parseInt(con.nextToken());
        StringTokenizer nums = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0 ;i<n; i++){
            arr[i] = Integer.parseInt(nums.nextToken());
        }
        bw.write(T.solution(n, k, arr));
        bw.flush();
    }
}
