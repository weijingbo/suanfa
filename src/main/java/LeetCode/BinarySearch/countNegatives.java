package LeetCode.BinarySearch;

public class countNegatives {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        int col = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            int low = 0;
            int high = col;
            while(low<high){
                int mid = low+(high-low)/2;
                if(grid[i][mid]>=0){
                    low = mid+1;
                }else{
                    high = mid;
                }
            }
            System.out.println("low="+low+"high="+high);
            ans += col-low;
        }
        return ans;
    }

    public static void main(String[] args) {
        countNegatives countNegatives = new countNegatives();
        System.out.println(countNegatives.countNegatives(new int[][]{{4,3,2,1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
    }
}
