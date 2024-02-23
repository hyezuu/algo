import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public String solution(int c, int[] arr){
        StringBuilder sb = new StringBuilder();
        int[] cache = new int[c];

        for(int i=0; i<arr.length;i++){
            int tmp = arr[i];
            int j, k;
            boolean isUpdated = false;
            for(j=1; j<c-1; j++){
                if(cache[j]==tmp||cache[j]==0){
                    for(k=j-1; k>=0; k--){
                        cache[k+1] = cache[k];
                    }
                    cache[k+1]=tmp;
                    isUpdated = true;
                    break;
                }
            }
            if(!isUpdated){
                for(k=j-1; k>=0; k--){
                    cache[k+1] = cache[k];
                }
                cache[k+1]=tmp;
            }
        }
        for(int m : cache){
            sb.append(m).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer cond = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(cond.nextToken());
        int n = Integer.parseInt(cond.nextToken());
        StringTokenizer nums = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(nums.nextToken());
        }
        System.out.println(T.solution(c,arr));
    }
}
