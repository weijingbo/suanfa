package LeetCode.TwentyThree.March;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class getFolderNames {
    public String[] getFolderNames(String[] names) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < names.length; i++) {
            int temp = 1;
            while(set.contains(names[i])) {
                int len = temp==1?names[i].length():names[i].length()-3;
                names[i] = names[i].substring(0,len) + "(" + temp + ")";
                temp++;
            }
            set.add(names[i]);
        }
        return names;
    }


    public static void main(String[] args) {
        getFolderNames getFolderNames = new getFolderNames();
        System.out.println(Arrays.toString(getFolderNames.getFolderNames(new String[]{"gta", "gta(1)", "gta", "avalon"})));
    }
}
