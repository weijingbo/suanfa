package LeetCode.March;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class M3D12 {

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}


    ArrayList<Integer> list = new ArrayList<Integer>();
        public List<Integer> postorder(Node root) {
            if(root == null){
                return list;
            }
            for (Node children : root.children
                 ) {
                dfs(children);
            }
            list.add(root.val);
            return list;
        }

    public void dfs(Node tree){
        if(tree ==null){
            return;
        }
        for (Node children : tree.children
        ) {
            dfs(children);
        }
        list.add(tree.val);
    }


}
