package LeetCode.TwentyTwo.March;

import java.util.Arrays;


public class M3D8 {
    /***
     * 给你一个长桌子，桌子上盘子和蜡烛排成一列。给你一个下标从 0 开始的字符串 s ，它只包含字符 '*' 和 '|' ，其中 '*' 表示一个 盘子 ，'|' 表示一支 蜡烛 。
     *
     * 同时给你一个下标从 0 开始的二维整数数组 queries ，其中 queries[i] = [lefti, righti] 表示 子字符串 s[lefti...righti] （包含左右端点的字符）。对于每个查询，你需要找到 子字符串中 在 两支蜡烛之间 的盘子的 数目 。如果一个盘子在 子字符串中 左边和右边 都 至少有一支蜡烛，那么这个盘子满足在 两支蜡烛之间 。
     *
     * 比方说，s = "||**||**|*" ，查询 [3, 8] ，表示的是子字符串 "*||**|" 。子字符串中在两支蜡烛之间的盘子数目为 2 ，子字符串中右边两个盘子在它们左边和右边 都 至少有一支蜡烛。
     * 请你返回一个整数数组 answer ，其中 answer[i] 是第 i 个查询的答案。
     * 示例 1:
     * 输入：s = "**|**|***|", queries = [[2,5],[5,9]]
     * 输出：[2,3]
     * 解释：
     * - queries[0] 有两个盘子在蜡烛之间。
     * - queries[1] 有三个盘子在蜡烛之间。
     * 示例 2:
     * 输入：s = "***|**|*****|**||**|*", queries = [[1,17],[4,5],[14,17],[5,11],[15,16]]
     * 输出：[9,0,0,0,0]
     * 解释：
     * - queries[0] 有 9 个盘子在蜡烛之间。
     * - 另一个查询没有盘子在蜡烛之间。
     */
    //自己写的办法超时
//    public int[] platesBetweenCandles(String s, int[][] queries) {
//        int[] ans = new int[queries.length];
//        for(int i=0;i<queries.length;i++){
//            String temp = s.substring(queries[i][0],queries[i][1]+1);
//            System.out.println(temp);
//            int start = temp.indexOf("|");
//            int end =temp.lastIndexOf("|");
//            int count = 0;
//            for(int j = start;j<end;j++){
//               if(temp.charAt(j) == '*'){
//                   count++;
//               }
//            }
//            ans[i] = count;
//        }
//        return ans;
//    }
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] preSum =new int[n];
        int[] ans = new int[queries.length];
        for (int i = 0,sum = 0; i < n; i++) {
            if(s.charAt(i) == '*'){
                sum++;
            }
            preSum[i] = sum;
        }
        int[] left = new int[n];
        for (int i = 0, l = -1; i < n; i++) {
            if (s.charAt(i) == '|') {
                l = i;
            }
            left[i] = l;
        }
        int[] right = new int[n];
        for (int i = n - 1, r = -1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                r = i;
            }
            right[i] = r;
        }

        for (int i = 0; i < queries.length; i++) {
            int x = right[queries[i][0]], y = left[queries[i][1]];
            ans[i] = x == -1 || y == -1 || x >= y ? 0 : preSum[y] - preSum[x];
        }
        return ans;
    }


    public static void main(String[] args) {
        M3D8 m3D8 = new M3D8();
        int[][] queries =new int[][]{{1,17},{4,5},{14,17},{5,11}, {15, 16}};//
        int[] ans = m3D8.platesBetweenCandles("***|**|*****|**||**|*",queries);
        System.out.println(Arrays.toString(ans));
    }
}
