import java.util.LinkedList;
import java.util.Queue;

/*
이진트리 순회(넓이우선탐색 : 레벨탐색)
루트에서 특정 지점으로 갈 때의 최단거리
queue를 사용한다 !(dfs는 스택)
        1           0레벨
 (왼)2     (오)3     1레벨(루트에서 한번만에 갈 수 있는 노드들)
 4    5    6   7    2레벨(루트에서 두번만에 갈 수 있는 노드들)

레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
 */
class Node{
    int data;
    Node lt, rt;
    //lt, rt는 인스턴스 변수
    public Node(int val){
        data = val;
        lt=rt=null;
    }
}
public class Main {
    Node root;
    public void BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;

        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                Node cur = Q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt!=null) Q.offer(cur.lt);
                if(cur.rt!=null) Q.offer(cur.rt);
            }
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}