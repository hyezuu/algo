import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] interval = new int[4];
        int[][] board = new int[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++){
                interval[j] = Integer.parseInt(st.nextToken());
            }
            bw.write(prefixSum(interval, board) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
    //interval = {x1, y1, x2, y2}
    static int prefixSum(int[] interval, int[][] board) {
        int sum = 0;
        for(int x =interval[0]-1; x<=interval[2]-1; x++){
            for(int y = interval[1]-1; y<=interval[3]-1; y++){
                sum+=board[x][y];
            }
        }
        return sum;
    }
}

//static int[] counts= {0, 0, 0};
//    static int[][] paper;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        paper = new int[N][N];
//
//        for(int i = 0; i < N; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for(int j = 0; j < N; j++) {
//                paper[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        recurse(0, N);
//
//        for(int i=0; i<3; i++){
//            System.out.println(counts[i]);
//        }
//    }
//
//    static void recurse(int start ,int end) {
//        int len = end-start;
//        for(int i=start; i<len; i++){
//            for(int j=start; j<len; j++){
//                if(paper[i][j]!=paper[start][start]){
//                    recurse(,j);
//                }
//            }
//        }
//
//        counts[paper[start][start]+1]++;
//    }