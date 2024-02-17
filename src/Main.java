import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k-1; i++){//k==4 ? 3가ㅈㅣ까지만 저장해둔다
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1);
            if(map.get(arr[lt])==0)map.remove(arr[lt]);
            lt++;
        }
        return answer;
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
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(nums.nextToken());
        }
        for (Integer a : T.solution(n, k, arr)) {
            bw.write(a + " ");
        }
        bw.flush();
    }
}
