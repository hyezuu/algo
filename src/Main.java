import java.io.BufferedReader;
import java.io.InputStreamReader;

//이진트리 순회(깊이우선탐색(DFS))
//전위순회 . 후위순회 연습
/*
       1(부모노드, 루트노드)
 (왼)2     (오)3
 4    5    6   7

전위순회 출력 : 1 2 4 5 3 6 7
    부모-> 왼쪽자식 -> 오른쪽자식

중위순회 출력 : 4 2 5 1 6 3 7
    왼쪽자식 -> 부모 -> 오른쪽자식 (부모를 중간에 방문)

후위순회 출력 : 4 5 2 6 7 3 1 //병합정렬
    왼쪽자식 -> 오른쪽자식 -> 부모 (부모를 마지막에 방문)

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
    public void DFS(Node root){
        if(root==null) return;
        else{
//            System.out.print(root.data+" ");//전위순회
            DFS(root.lt);
//            System.out.print(root.data+" ");//중위순회
            DFS(root.rt);
//            System.out.print(root.data+" ");//후위순회
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
        tree.DFS(tree.root);
    }
}
