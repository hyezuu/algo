import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] arr = st.nextToken().toCharArray();
        int m = Integer.parseInt(st.nextToken());


        for(int i=0; i<m; i++){
            char tmp = arr[i];
            char max = tmp;
            int idx = i;
            boolean flag = false;
            for(int j=i+1; j<arr.length; j++){
                if(max < arr[j]){
                    max = arr[j];
                    idx = j;
                    flag = true;
                }
            }
            arr[idx] = arr[i];
            arr[i] = max;
        }

        bw.write(String.valueOf(arr));

        bw.flush();
        bw.close();
        br.close();
    }
}
