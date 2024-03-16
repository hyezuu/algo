import java.io.IOException;
import java.util.Arrays;
import java.util.*;

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
    public int DFS(int L, Node root){
        if(root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
        //but 자식이 하나만 있으면 npe 발생할 수 있음
    }
    public static void main(String[] args) throws IOException {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
