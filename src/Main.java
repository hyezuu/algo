import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Point implements Comparable<Point>{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o){
        if(this.x==o.x) return o.y-this.y;
        else return o.x-this.x;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringTokenizer lines = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(lines.nextToken());
            int y = Integer.parseInt(lines.nextToken());
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);

        for(Point o : arr){
            bw.write(o.x+" "+o.y+"\n");
        }
        bw.flush();
    }
}
