package LeetCode.zhitongche;


import java.util.*;


/**
 * 2022年8.6日美团面试题
 */
public class meituan {

    public int question1(int a,int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(a>2*b) return b;
        else return (a+b)/3;
    }
//    public int question2(int[] arr){
//        int zheng=0;
//        int fu = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if
//        }
//    }

    public int question3(int[] upper,int[] down){
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> downmap = new HashMap<>();
        for (int i = 0; i < upper.length; i++) {
            map.put(upper[i],map.getOrDefault(upper[i],0)+1);
            if(down[i] != upper[i]){
                map.put(down[i],map.getOrDefault(down[i],0)+1); //统计正反面的数量能否超过一半
                downmap.put(down[i],downmap.getOrDefault(down[i],0)+1); //统计该值需要翻转的次数
            }
        }
        int ans =Integer.MAX_VALUE;
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            if(entry.getValue()> (upper.length+1)/2){
                if(entry.getValue()-downmap.get(entry.getKey())>= (upper.length+1)/2){
                    ans = 0;
                } //考虑不翻转的情况
                if(downmap.get(entry.getKey())<ans){
                    ans = downmap.get(entry.getKey());
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    public List<List<Integer>> question4(int[] arr, int k){
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for (int i = 1; i <= k; i++) {
            map.put(i,(map.get(i)+1)/2); //向上取整
        }
        List<Integer> train = new ArrayList<>();
        List<Integer> test = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])>0){
                train.add(i+1);
                map.put(arr[i], map.get(arr[i])-1);
            }else{
                test.add(i+1);
            }
        }
        ans.add(train);
        ans.add(test);
        return ans;
    }

    public static void main(String[] args) {
        meituan meituan = new meituan();
        System.out.println(meituan.question3(new int[]{1,5,7,5,5},new int[]{10,5,5,9,10}));
        //System.out.println(meituan.question4(new int[]{3,2,2,1,2,3,1,3,3,3},3));
    }
}
