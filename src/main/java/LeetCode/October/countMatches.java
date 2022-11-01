package LeetCode.October;

import java.util.List;

public class countMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans  =0;
        int rule;
        if(ruleKey.equals("type")){
            rule=0;
        }else if(ruleKey.equals("color")){
            rule =1;
        }else {
            rule=2;
        }
        for (List<String> item: items) {
            if(item.get(rule).equals(ruleValue)){
                ans++;
            }
        }
        return ans;
    }
}
