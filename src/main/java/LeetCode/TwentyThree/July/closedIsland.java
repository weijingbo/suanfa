package LeetCode.TwentyThree.July;

public class closedIsland {
    int[][] visited;
    public int closedIsland(int[][] grid) {
        int ans =0;
        visited = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    dfs(grid,i,j);
                    ans++;
                }

            }
        }
        return ans;
    }
    public void dfs(int[][] grid, int i, int j){
        if(i<0 ||i>=grid.length || j<0 || j>=grid[0].length){
            return;
        }
        if( visited[i][j]==1){
            return;
        }else {
            visited[i][j]=1;
            if (grid[i][j] == 1){
                dfs(grid,i,j+1); //右
                dfs(grid,i,j-1); //左
                dfs(grid,i+1,j); //下
                dfs(grid,i-1,j); //上
            }
        }

    }

    public static void main(String[] args) {
        closedIsland closedIsland = new closedIsland();
        System.out.println(closedIsland.closedIsland(new int[][]{{1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}}));
    }
}
