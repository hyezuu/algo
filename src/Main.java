import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public String solution(int n, int[] nums){
        Set<Integer> num = new HashSet<>();
        for(int a : nums){
            if(!num.add(a))return "D";
        }
        return "U";
    }
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer fn = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(fn.nextToken());
        }

        System.out.print(T.solution(n, nums));
    }
}
