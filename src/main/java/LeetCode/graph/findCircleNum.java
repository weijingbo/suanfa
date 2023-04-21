package LeetCode.graph;

import java.util.HashSet;

public class findCircleNum {
    public int findCircleNum(int[][] M) {
        boolean[] visited = new boolean[M.length];
        int res = 0;
        for (int i = 0; i < M.length; i++) {
            if (!visited[i]) {
                dfs(M, visited, i);
                res++;
            }
        }
        return res;
    }

    public void dfs(int[][] m, boolean[] visited, int i) {
        for (int j = 0; j < m.length; j++) {
            if (m[i][j] == 1 && !visited[j]){
                visited[j]=true;
                dfs(m, visited, j);
            }
        }
    }

    public static void main(String[] args) {
        findCircleNum findCircleNum = new findCircleNum();
        System.out.println(findCircleNum.findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}}));
    }
}
