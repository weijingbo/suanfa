package LeetCode.TwentyTwo.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M3D23 {
    /***
     * 给定整数n和k，返回[1, n]中字典序第k小的数字。
     *
     * 
     *
     * 示例 1:
     *
     * 输入: n = 13, k = 2
     * 输出: 10
     * 解释: 字典序的排列是 [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9]，所以第二小的数字是 10。
     * 示例 2:
     *
     * 输入: n = 1, k = 1
     * 输出: 1
     *
     */

    public int findKthNumber(int n, int k) {
        int p = 1; //寻找k小节点
        int prefix = 1; //前缀
        while(p<k){
            int count = getCount(prefix,n); // 获取该前缀下的数目
            if(p+count>k){  //找到的话
                prefix *=10;
                p++;
            }else if(p+count<=k){ //没有找到，寻找下一个前缀
                prefix ++;
                p+=count;
            }
        }
        return  prefix;
    }

    public int getCount(int prefix, int n){
        int cur = prefix;
        int next = prefix+1;
        int count = 0;
        while(cur <= n){
            count += Math.min(n+1,next) -cur;//防止发生溢出错误
            cur*=10;
            next*=10;
        }
        return  count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            line = in.readLine();
            int k = Integer.parseInt(line);

            int ret = new M3D23().findKthNumber(n, k);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
    
}
