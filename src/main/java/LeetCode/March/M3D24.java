package LeetCode.March;

import java.util.Arrays;

public class M3D24 {
    /***
     * 图像平滑器 是大小为 3 x 3 的过滤器，用于对图像的每个单元格平滑处理，平滑处理后单元格的值为该单元格的平均灰度。
     *
     * 每个单元格的  平均灰度 定义为：该单元格自身及其周围的 8 个单元格的平均值，结果需向下取整。（即，需要计算蓝色平滑器中 9 个单元格的平均值）。
     *
     * 如果一个单元格周围存在单元格缺失的情况，则计算平均灰度时不考虑缺失的单元格（即，需要计算红色平滑器中 4 个单元格的平均值）。
     */

    public int[][] imageSmoother(int[][] img) {
        int row = img.length,col = img[0].length;
        int[][] res = new int[row][col];
        for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                int x1 = Math.max(i-1,0);
                int y1 = Math.max(j-1,0);
                int x2 = Math.min(i+1, row-1);
                int y2 = Math.min(j+1, col-1);
                int sum=0,count=0;
                for(int x= x1;x<x2+1;x++){
                    for(int y =y1;y<y2+1;y++){
                        sum += img[x][y];
                        count++;
                    }
                }
                res[i][j] = sum/count;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        M3D24 m3D24 = new M3D24();
        int[][] res = m3D24.imageSmoother(new int[][]{{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}});
        for (int[] row: res) {
            System.out.println(Arrays.toString(row));
        }
    }


}
