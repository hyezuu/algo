import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public String solution(int n, int k, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        //Collections.reversOrder() <- 오름차순
        //Comparator.reversOrder() <- 오름차순
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum;
        for(int i=0 ;i<n-2; i++){//조건 n이어도. j+1, l+1 <-조건때문에 내부for문 수행안한다.
            for(int j=i+1; j<n-1; j++){
                for(int l=j+1; l<n; l++){
                    set.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt =0;
        for(int i : set){
            cnt++;
//            System.out.println(cnt+"-"+i);
            if(cnt==k)return i+"";
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