import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] arr = st.nextToken().toCharArray();
        int m = Integer.parseInt(st.nextToken());

        int i = m < arr.length ? m : m % arr.length + 1, k = 0;

        while (i > 0) {
            char tmp = arr[k];
            char max = tmp;
            int idx = k;
            boolean flag = false;
            for (int j = k + 1; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    idx = j;
                    flag = true;
                }
            }
            if(flag){
                arr[idx] = tmp;
                arr[k] = max;
                i--;
            }
            k++;
            if(k == arr.length){

            }
        }

        bw.write(String.valueOf(arr));

        bw.flush();
        bw.close();
        br.close();
    }
}
