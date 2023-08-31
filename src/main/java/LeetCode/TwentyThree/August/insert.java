package LeetCode.TwentyThree.August;

import java.util.ArrayList;
import java.util.List;

public class insert {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int size = intervals.length;
        ArrayList<int[]> list = new ArrayList<>();
        int i = 0;
        for (; i <size && intervals[i][1]<newInterval[0]; i++) {
            list.add(intervals[i]);
        }
        for (; i <size && intervals[i][0]<=newInterval[1]; i++) {
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
        }
        list.add(newInterval);
        for (; i <size; i++) {
            list.add(intervals[i]);
        }
        int[][] resultArray = new int[list.size()][];
        for (int j = 0; j < list.size(); j++) {
            resultArray[j] = list.get(j);
        }
        return resultArray;
    }
}
