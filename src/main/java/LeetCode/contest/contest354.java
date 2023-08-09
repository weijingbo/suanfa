package LeetCode.contest;

import java.util.*;

public class contest354 {
    public static int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                ans+=nums[i-1]*nums[i-1];
            }
        }
        return ans;
    }
    public static int maximumBeauty(int[] nums, int k) {
        int ans =0;
        Arrays.sort(nums);
        int low=0,high=0;
        while(high<nums.length){
            if(nums[high]-nums[low]<=2*k){
                high++;
            }
            ans = Math.max(ans,high-low);
            while(high<nums.length && nums[high]-nums[low]>2*k){
                low++;
            }

        }

        return ans;
    }

    public static int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        HashMap<Integer,Integer> mapright = new HashMap<>();
        HashMap<Integer,Integer> mapleft = new HashMap<>();
        for (Integer num : nums) {
            mapright.put(num,mapright.getOrDefault(num,0)+1);
        }
        for (int i = 1; i < n; i++) {
            mapright.put(nums.get(i),mapright.get(nums.get(i))-1);
            mapleft.put(nums.get(i),mapleft.getOrDefault(nums.get(i),0)+1);
            ArrayList<Map.Entry<Integer, Integer>> leftlist = new ArrayList<>(mapleft.entrySet());
            ArrayList<Map.Entry<Integer, Integer>> rightlist = new ArrayList<>(mapright.entrySet());
            leftlist.sort(new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            rightlist.sort(new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            if(leftlist.get(0).getKey()==rightlist.get(0).getKey()){
                int left = leftlist.get(0).getValue();
                int right = rightlist.get(0).getValue();
                if(left*2>i+1 && right*2>n-i-1){
                    return i;
                }
            }

        }
        return -1;

    }

    public static int longestValidSubstring(String word, List<String> forbidden) {
        int low=0,high=1;
        int ans =0;
        while(high<word.length()){
            String substr = word.substring(low,high);
            if(isforbiden(substr,forbidden)){
                high++;
            }
            while(isforbiden(substr,forbidden)){
                low++;
            }
            ans = Math.min(ans,high-low+1);
        }
        return ans;
    }

    public static Boolean isforbiden(String word, List<String> forbidden){
        for (String s : forbidden) {
            if(word.contains(s)){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4};
//        int[] arr2 = {2,7,1,19,18,3};
//        System.out.println(sumOfSquares(arr1));
//        System.out.println(sumOfSquares(arr2));

//        System.out.println(maximumBeauty(new int[]{75,15,9}, 28));
//        System.out.println(maximumBeauty(new int[]{4,6,1,2}, 2));
//        System.out.println(maximumBeauty(new int[]{1,1,1,1}, 10));
//        List<Integer> arr1 = new ArrayList<>();
//        arr1.add(1);
//        arr1.add(2);
//        arr1.add(2);
//        arr1.add(2);
//
//        System.out.println(minimumIndex(arr1));

    }
}
