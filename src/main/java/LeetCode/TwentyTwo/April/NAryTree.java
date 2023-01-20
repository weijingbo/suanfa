package LeetCode.TwentyTwo.April;

import Base.Node;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class NAryTree {
    /**
     * 树的层序遍历
     */
    public List<List<Integer>> levelOrder(Node root) {
        Deque<Node> deque = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        deque.addLast(root);
        while(!deque.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int n = deque.size();
            for(int i =0;i<n;i++){
                Node node = deque.pollFirst();
                temp.add(node.val);
                for (Node chird : node.children) {
                    deque.addLast(chird);
                }
            }
            ans.add(temp);
        }
            return ans;
    }

}
