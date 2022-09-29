package LeetCode.April;

public class D26ProjectionArea {
    public int projectionArea(int[][] grid) {
        int[] x = new int[grid.length];
        int[] y = new int[grid[0].length];
        int z = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                x[j] = i==0? grid[0][j]:Math.max(grid[i][j],x[j]);
                y[i] = j==0? grid[i][0]:Math.max(grid[i][j],y[i]);
                if(grid[i][j]!=0) z++;
            }
        }
        int res = 0;
        for (int xx:x) {
            res+=xx;
        }
        for(int yy:y){
            res+=yy;
        }
        res+=z;
        return  res;
    }

    public static void main(String[] args) {
        D26ProjectionArea d26ProjectionArea = new D26ProjectionArea();
        System.out.println(d26ProjectionArea.projectionArea(new int[][]{{1,0},{0,2}}));
    }
}
