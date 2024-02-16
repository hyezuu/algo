import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 =0 , p2 =0;

        while(p1<n && p2<m){
            if(a[p1]<b[p2]) answer.add(a[p1++]); //후위증감연산자!!!!!!! 오
            else answer.add(b[p2++]);
        }

        while (p1<n) answer.add(a[p1++]);
        while (p2<m) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer nums1 = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(nums1.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        StringTokenizer nums2 = new StringTokenizer(br.readLine());
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(nums2.nextToken());
        }

        for (int i : T.solution(n, m, a, b)) {
            bw.write(i + " ");
        }
        bw.flush();
    }
}