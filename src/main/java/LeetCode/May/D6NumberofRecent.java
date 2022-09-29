package LeetCode.May;

import java.util.ArrayDeque;
import java.util.Queue;

public class D6NumberofRecent {
    Queue<Integer> res;
    public D6NumberofRecent() {
        res = new ArrayDeque<>();
    }

    public int ping(int t) {
        res.offer(t);
        while(res.peek()+3000<t){
            res.poll();
        }
        return res.size();
    }
}
