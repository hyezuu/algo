import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] students = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                students[j] = Integer.parseInt(st.nextToken());
            }
            bw.write(bfs(students) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    //방문체크는 팀원을 구했거나, 팀원을 구하지 못할경우에 한다
    //최근에 입력된 값들은 변수에 저장한다.
    private static int bfs(int[] students) {
        boolean[] chk = new boolean[students.length];
        int cnt = 0;
        for (int i = 0; i < students.length; i++) {
            Deque<Integer> deque = new ArrayDeque<>();
            boolean[] visited = new boolean[students.length];
            if(!chk[i]){
                deque.add(i);
                visited[i] = true;
            }
            //가장 큐에 들어간 값
            while (!deque.isEmpty()) {
                int last = deque.getLast();
                int next = students[last] - 1;
                //자기 혼자 팀하고싶을때
                if(last == next && chk[next]){
                    chk[next] = true;
                    break;
                }
                if(visited[next] && deque.peekFirst()==next){
                    while(!deque.isEmpty()){
                        chk[deque.removeFirst()] = true;
                    }
                }
                if(chk[next] || visited[next]) break;

                deque.add(next);
                visited[next] = true;
            }
        }
        for(boolean b : chk) if(!b) cnt++;

        return cnt;
    }
}