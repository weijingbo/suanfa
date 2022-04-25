package Base.huawei;

import java.util.*;

public class hauwei {
    public List<Integer> HuaweiOne(List<List<Integer>> maze) {
        List<Integer> requests = maze.get(maze.size() - 1);
        int N = requests.get(0), strategy = requests.get(1), cpuCount = requests.get(2),
                memSize = requests.get(3), cupArch = requests.get(4), supportNP = requests.get(5);
        // strategy 1 : CPU min || 2 : memSize min
        List<List<Integer>> no_N_strategy = new ArrayList<>();
        for (int i = 1; i < maze.size() - 1; i++) {
            if (supportNP != 2 && supportNP != maze.get(i).get(4)) continue;
            if (cupArch != 9 && cupArch != maze.get(i).get(3)) continue;
            if (maze.get(i).get(2) >= memSize && maze.get(i).get(1) >= cpuCount){
                no_N_strategy.add(maze.get(i));
            }
        }
        if (no_N_strategy.size() > N) {
            if (strategy == 1) {
                no_N_strategy.sort((o1, o2) -> {
                        if (o2.get(1) == o1.get(1)) return o2.get(2)==o1.get(2) ? o2.get(0) - o1.get(0):o2.get(2) - o1.get(2);
                        return o2.get(1) - o1.get(1);
                });
            }
            if (strategy == 2) {
                no_N_strategy.sort((o1, o2) -> {
                        if (o2.get(2) == o1.get(2)) return o2.get(1) == o1.get(1) ? o2.get(0) - o1.get(0):o2.get(1) - o1.get(1);
                        return o2.get(2) - o1.get(2);
                });
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(Math.min(N, no_N_strategy.size()));
        if (result.get(0) == 0) return result;
        for (int i = no_N_strategy.size() - 1; i >= Math.max(0, no_N_strategy.size() - N); i--) {
            result.add(no_N_strategy.get(i).get(0));
        }
        return result;
    }

    public static void main(String[] args) {
        hauwei ho = new hauwei();
        List<List<Integer>> maze = new ArrayList<>();
        List<Integer> subMaze1 = new ArrayList<>(Arrays.asList(6));
        List<Integer> subMaze2 = new ArrayList<>(Arrays.asList(0, 2, 200, 0, 0));
        List<Integer> subMaze3 = new ArrayList<>(Arrays.asList(1, 3, 400, 0, 1));
        List<Integer> subMaze4 = new ArrayList<>(Arrays.asList(2, 3, 400, 1, 0));
        List<Integer> subMaze5 = new ArrayList<>(Arrays.asList(3, 3, 300, 0, 1));
        List<Integer> subMaze6 = new ArrayList<>(Arrays.asList(3, 1, 3, 200, 0, 1));
        maze.add(subMaze1);
        maze.add(subMaze2);
        maze.add(subMaze3);
        maze.add(subMaze4);
        maze.add(subMaze5);
        maze.add(subMaze6);
//        maze.add(subMaze7);
        System.out.println(ho.HuaweiOne(maze));
    }
}
