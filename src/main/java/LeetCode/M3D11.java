package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class M3D11 {

    public int countHighestScoreNodes(int[] parents) {
        int[][] tree = new int[parents.length][5]; //构建一个二维数组，如第一行[[],[],[],[],[]],第一个代表几号节点，第二个代表父节点，第三第四代表子节点，最后一个代表权重
        for (int i = 0; i <parents.length ; i++) {
            tree[i] = new int[]{i,parents[i],-1,-1,1};
            if(tree[parents[i]][2]!=-1){
                tree[parents[i]][2] = parents[i];
            }else{
                tree[parents[i]][3] = parents[i];
            }
        }
    return  tree[4][4];
    }

    public static void main(String[] args) {
        M3D11 m3D11 = new M3D11();
        System.out.println(m3D11.countHighestScoreNodes(new int[]{-1,2,0,2,0}));
    }
}
