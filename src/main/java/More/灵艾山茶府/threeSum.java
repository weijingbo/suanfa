package More.灵艾山茶府;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i =0;i<n-2;i++){
            int x = nums[i];
            if(i>0 && x==nums[i-1]){
                continue;
            }
            if(x+nums[i+1]+nums[i+2]>0 || x+nums[n-2]+nums[n-1]<0){
                break;
            }
            int j = i+1;
            int k = n-1;
            while(j<k){
                int s = x+nums[j]+nums[k];
                if(s>0){
                    k--;
                }else if(s<0){
                    j++;
                }else{
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(x);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    k--;
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }

            }
        }
        return ans;
    }
}
