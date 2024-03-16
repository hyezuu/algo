import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/*
아래와 같은 이진트리에서 루트노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(edge)의 갯수 길이로 하겟습니다
            1
    2               3
4       5

가장 짧은 길이는 3번노드까지의 길이인 1이다

 */
class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt=rt=null;
    }
}
public class Main {
    Node root;
    public int BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L=0;
        while (!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                Node cur = Q.poll();
                if(cur.lt==null && cur.rt ==null) return L;//말단노드인지 확인!
                if(cur.lt!=null) Q.offer(cur.lt);
                if(cur.rt!=null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0; //statement error 방지용
    }
    public static void main(String[] args) throws IOException {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
