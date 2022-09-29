package Base.huawei;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<List<Integer>> maze = new ArrayList<>();
        int[][] req = new int[][]{
                {0,2,200,0,1},
                {1,4,330,2,1},
                {2,3,400,3,1},
                {3,3,310,1,1},
                {4,3,320,8,1},
                {5,3,330,0,1}};
        int N=3;
        int strategy=2;
        int cpuCount=3;
        int memSize=300;
        int cpuArch=9;
        int supportNP=2;
        for (int[] re:req) {
            List<Integer> list = new ArrayList<>();
            for (int r:re) {
                list.add(r);
            }
            maze.add(list);
        }
        List<Integer> requests = maze.get(maze.size() - 1);
// strategy 1 : CPU min || 2 : memSize min
        List<List<Integer>> no_N_strategy = new ArrayList<>();
        for (int i = 1; i < maze.size() - 1; i++) {
            if (supportNP != 2 && supportNP != maze.get(i).get(4)) continue;
            if (cpuArch != 9 && cpuArch != maze.get(i).get(3)) continue;
            if (maze.get(i).get(2) >= memSize && maze.get(i).get(1) >= cpuCount){
                no_N_strategy.add(maze.get(i));
            }
        }
        if (no_N_strategy.size() > N) {
            if (strategy == 1) {
                no_N_strategy.sort(new Comparator<List<Integer>>() {
                    @Override
                    public int compare(List<Integer> o1, List<Integer> o2) {
                        if (o2.get(1) == o1.get(1)) {
                            if (o2.get(2) == o1.get(2)) {
                                return o2.get(0) - o1.get(0);
                            }
                            return o2.get(2) - o1.get(2);
                        }
                        return o2.get(1) - o1.get(1);
                    }
                });
            }
            if (strategy == 2) {
                no_N_strategy.sort(new Comparator<List<Integer>>() {
                    @Override
                    public int compare(List<Integer> o1, List<Integer> o2) {
                        if (o2.get(2) == o1.get(2)) {

                            if (o2.get(1) == o1.get(1)) {

                                return o2.get(0) - o1.get(0);
                            }
                            return o2.get(1) - o1.get(1);
                        }
                        return o2.get(2) - o1.get(2);
                    }
                });
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(Math.max(N, no_N_strategy.size()));
        for (int i = no_N_strategy.size() - 1; i >= no_N_strategy.size() - N; i--) {
            result.add(no_N_strategy.get(i).get(0));
        }
        System.out.println(result);;
    }
}
