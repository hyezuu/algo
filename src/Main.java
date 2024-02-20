import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Person {
    int index;
    int priority;
    public Person(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}
public class Main {
    public String solution(int n, int m, int[] arr) {
        StringBuilder sb = new StringBuilder();
        Queue<Person> q = new LinkedList<>();
        int answer = 0;
        for(int i=0; i<n; i++){
            q.offer(new Person(i, arr[i]));
        }
        while (!q.isEmpty()){
            Person tmp = q.poll();
            for(Person x : q){
                if(x.priority>tmp.priority){
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.index ==m) {
                    sb.append(answer);
                    break;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer cond = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(cond.nextToken());
        int m = Integer.parseInt(cond.nextToken());

        StringTokenizer nums = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(nums.nextToken());
        }
        bw.write(T.solution(n, m, arr));
        bw.flush();
    }
}