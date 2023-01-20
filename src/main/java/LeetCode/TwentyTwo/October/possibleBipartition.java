package LeetCode.TwentyTwo.October;

import java.util.ArrayList;
import java.util.List;

public class possibleBipartition {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] color = new int[n+1];
        List<Integer>[] g = new List[n+1];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int[] dislike : dislikes) {
            g[dislike[0]].add(dislike[1]);
            g[dislike[1]].add(dislike[0]);
        }
        for (int i = 1; i <=n ; ++i) {
            if(color[i]==0 && !dfs(i,1,color,g)){
                return false;
            }
        }
        return true;
    }

    public boolean dfs(int curnode,int newcolor, int[] color, List<Integer>[] g){
        color[curnode]=newcolor;
        for (int nextnode : g[curnode]) {
            if (color[nextnode] != 0 && color[nextnode] == color[curnode]) {
                return false;
            }
            if (color[nextnode] == 0 && !dfs(nextnode, 3 ^ newcolor, color, g)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        possibleBipartition bipartition = new possibleBipartition();
        System.out.println(bipartition.possibleBipartition(4,new int[][]{{1,2},{1,3},{2,4}}));
    }
}
