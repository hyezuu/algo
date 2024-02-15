import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public int[] solution(int n, int m, int[] arr1, int[] arr2) {
        int[] answer = new int[n+m];

        for(int i=0; i<n+m; i++){
            if(i<n){
                answer[i] = arr1[i];
            }
            else
                answer[i] = arr2[i-n];
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer nums1 = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for (int i=0; i<n; i++){
            arr1[i] = Integer.parseInt(nums1.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        StringTokenizer nums2 = new StringTokenizer(br.readLine());
        int[] arr2 = new int[m];
        for (int i=0; i<m; i++){
            arr2[i] = Integer.parseInt(nums2.nextToken());
        }

        for(int i : T.solution(n,m,arr1,arr2)){
            bw.write(i+" ");
        }
        bw.flush();
    }
}