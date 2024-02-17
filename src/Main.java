import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n, int k, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum;
        for(int i=0 ;i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int l=j+1; l<n; l++){
                    sum = arr[i]+arr[j]+arr[l];
                    set.add(sum);
                }
            }
        }
        int cnt =0;
        for(Integer i : set){
            cnt++;
            if(cnt==k){
                return i+"";
            }
        }
        return "-1";
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer con = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(con.nextToken());
        int k = Integer.parseInt(con.nextToken());
        StringTokenizer num = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(num.nextToken());
         }
        bw.write(T.solution(n, k, arr));
        bw.flush();
    }
}