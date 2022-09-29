package More.huawei;

import java.util.*;

public class Question2 {
    /**
     * 输入：
     * 4
     * 2
     * 0
     * 1,0
     * 1,1
     * 2,0,1
     * 输出：
     * 0,1
     * 解释：
     * 第一行，4，一共四个服务，编号从0~3
     * 第二行，2，指定启动服务编号为2的服务
     * 第三行开始，为服务依赖关系（从编号为0的服务开始）
     * 第三行，0，表示服务0，没有依赖的前置服务（依赖个数为0）
     * 第四行，1,0 表示服务1，依赖一个1个前置服务，依赖的前置服务编号为0
     * 第五行，1,1 表示服务2，依赖一个1个前置服务，依赖的前置服务编号为1
     * 第六行，2.0.1 表示服务3，依赖一个2个前置服务，依赖的前置服务编号为0,1
     *
     * 分析，服务启动顺序为0,1,2，可以成功启动服务2，返回0,1
     * @param n 一共有N个服务器
     * @param m 启动第M个服务器
     * @param depend   服务器之间的依赖关系
     * @return
     */
    private static int[] indgree;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        List<String[]> tmp = new ArrayList<>();
        List<int[]> input = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            tmp.add(scanner.nextLine().split(","));
        }

        for (int i = 0; i < N; i++) {
            int[] num = new int[tmp.get(i).length];
            for (int j = 0; j < num.length; j++) {
                num[j] = Integer.parseInt(tmp.get(i)[j]);
            }
            input.add(num);
        }

        //解决问题
        if (input.get(m)[0] == 0) {
            System.out.println("null");
            return;
        }


        //构建线性表使用TreeSet，可以在去重的同时进行元素的排序
        List<Set<Integer>> sets = new ArrayList<>();
        //构建邻接表，以及入度数组
        indgree = new int[N];

        List<Integer>[] graph = buildGraph(N, input);

        //将图中入度为0的节点入队列，同时“填充好”线性表
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            if (indgree[i] == 0) {
                queue.offer(i);
            }
            sets.add(new TreeSet<>());
        }

        int count=0;
        //分别对整个入度数组进行遍历，若入度为0，则加入队列，同时将该父节点以及该父节点的所有父节点加入线性表中
        while (!queue.isEmpty()) {
            int idx = queue.poll();
            count++;
            for (int next : graph[idx]) {
                indgree[next]--;
                sets.get(next).add(idx);
                sets.get(next).addAll(sets.get(idx));
                if (indgree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        // 有环，无法进行拓扑排序
        if (count!=N) {
            System.out.println(-1);
            return;
        }

        int[] res = new int[sets.get(m).size()];
        int k = 0;
        for (int num : sets.get(m)) {
            res[k++] = num;
        }
        System.out.print(res[0]);
        for (int i = 1; i < res.length; i++) {
            System.out.print("," + res[i]);
        }
    }

    public static List<Integer>[] buildGraph(int N, List<int[]> prerequisites) {
        List<Integer>[] graph = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new LinkedList<>();
        }
        for (int i = 0; i < prerequisites.size(); i++) {
            int[] edge = prerequisites.get(i);
            for (int j = 1; j < edge.length; j++) {
                graph[edge[j]].add(i);
                indgree[i]++;
            }
        }
        return graph;
    }
}
