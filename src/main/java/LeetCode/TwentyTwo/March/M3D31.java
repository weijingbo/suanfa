package LeetCode.TwentyTwo.March;

import java.util.ArrayList;
import java.util.List;

public class M3D31 {
    /**
     * 自除数 是指可以被它包含的每一位数整除的数。
     *
     * 例如，128 是一个 自除数 ，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
     * 自除数 不允许包含 0 。
     *
     * 给定两个整数 left 和 right ，返回一个列表，列表的元素是范围 [left, right] 内所有的 自除数 。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：left = 1, right = 22
     * 输出：[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
     * 示例 2:
     *
     * 输入：left = 47, right = 85
     * 输出：[48,55,66,77]
     *  
     *
     * 提示：
     *
     * 1 <= left <= right <= 104
     *
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(checknumber(i)){
                list.add(i);
            }
        }
        return list;
    }

    public boolean checknumber(int i){
        if(i<10) return true;
        int temp =i;
        while(temp>=10){
            int devide = temp%10;
            if(devide ==0) return false;
            System.out.println(devide);
            temp = temp/10;
            if( i %devide !=0) return false;
        }
        if( i %temp ==0) return true;
        return false;
    }

    public static void main(String[] args) {
        M3D31 m3D31 = new M3D31();
        System.out.println(m3D31.selfDividingNumbers(47,22));
    }
}
