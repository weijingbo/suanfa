package More;

import java.util.*;

public class zhousai {
    public String digitSum(String s, int k) {
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            deque.offer(s.charAt(i)-48);
        }
        Deque<Integer> second = new LinkedList<>();
        while(deque.size()>k){
            while(!deque.isEmpty()){
                int n = 0;
                int res = 0;
                while(n<k && !deque.isEmpty()){
                    res += deque.poll();
                    n++;
                }
                if(res>=10){
                    int temp = res/10;
                    second.offer(temp);
                    res = res%10;
                }
                second.offer(res);
            }
            while(!second.isEmpty()){
                deque.offer(second.poll());
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!deque.isEmpty()){
            sb.append(deque.poll());
        }
        return sb.toString();
    }

    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int res =0 ;
        for (Integer key: map.keySet()) {
            int temp = map.get(key);
            if(temp==1) return -1;
            while(temp>0){
                if(temp>=3){
                    temp -=3;
                    res++;
                }else{
                    temp -=2;
                    res++;
                }
            }
        }
        return res;
    }

//    public int maxTrailingZeros(int[][] grid) {
//        int row = grid.length;
//        int col = grid[0].length;
//        int max = 0;
//        int[] rowzero = new int[row];
//        int[] colzero = new int[col];
//        for(int i =0;i<row;i++){
//            for(int j = 0;j<col;j++){
//                int temp = 0;
//                int left=0,right=0,up=0,down=0;
//                if(grid[i][j]%5==0) temp++;
//                for(int ii =0;i<col;ii++){
//                    if(grid[ii][j]%5==0){
//                       if(ii<i) left++;
//                       else if(ii>i) right++;
//                    }
//                }
//                for(int jj =0;j<row;jj++){
//                    if(grid[i][jj]%5==0){
//                        if(jj<j) up++;
//                        else if(jj>j) down++;
//                    }
//                }
//            }
//        }
//    }


    public static void main(String[] args) {
        zhousai zhousai = new zhousai();
        //System.out.println(zhousai.digitSum("01234567890",2));
        //System.out.println(zhousai.minimumRounds(new int[]{2,2,3,3,2,4,4,4,4,4}));
        //System.out.println(zhousai.maxTrailingZeros(new int[][]{{23,17,15,3,20},{8,1,20,27,11},{9,4,6,2,21},{40,9,1,10,6},{22,7,4,5,3}}));
    }
}