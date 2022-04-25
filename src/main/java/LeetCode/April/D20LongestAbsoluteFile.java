package LeetCode.April;

import java.util.HashMap;
import java.util.TreeMap;

public class D20LongestAbsoluteFile {
    /**
     * 假设有一个同时存储文件和目录的文件系统。下图展示了文件系统的一个示例：
     *
     *
     *
     * 这里将 dir 作为根目录中的唯一目录。dir 包含两个子目录 subdir1 和 subdir2 。subdir1 包含文件 file1.ext 和子目录 subsubdir1；subdir2 包含子目录 subsubdir2，该子目录下包含文件 file2.ext 。
     *
     * 在文本格式中，如下所示(⟶表示制表符)：
     *
     * dir
     * ⟶ subdir1
     * ⟶ ⟶ file1.ext
     * ⟶ ⟶ subsubdir1
     * ⟶ subdir2
     * ⟶ ⟶ subsubdir2
     * ⟶ ⟶ ⟶ file2.ext
     * 如果是代码表示，上面的文件系统可以写为 "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" 。'\n' 和 '\t' 分别是换行符和制表符。
     *
     * 文件系统中的每个文件和文件夹都有一个唯一的 绝对路径 ，即必须打开才能到达文件/目录所在位置的目录顺序，所有路径用 '/' 连接。上面例子中，指向 file2.ext 的 绝对路径 是 "dir/subdir2/subsubdir2/file2.ext" 。每个目录名由字母、数字和/或空格组成，每个文件名遵循 name.extension 的格式，其中 name 和 extension由字母、数字和/或空格组成。
     *
     * 给定一个以上述格式表示文件系统的字符串 input ，返回文件系统中 指向 文件 的 最长绝对路径 的长度 。 如果系统中没有文件，返回 0。
     *
     *
     *
     * 示例 1：
     *
     *
     * 输入：input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"
     * 输出：20
     * 解释：只有一个文件，绝对路径为 "dir/subdir2/file.ext" ，路径长度 20
     * 示例 2：
     *
     *
     * 输入：input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
     * 输出：32
     * 解释：存在两个文件：
     * "dir/subdir1/file1.ext" ，路径长度 21
     * "dir/subdir2/subsubdir2/file2.ext" ，路径长度 32
     * 返回 32 ，因为这是最长的路径
     * 示例 3：
     *
     * 输入：input = "a"
     * 输出：0
     * 解释：不存在任何文件
     * 示例 4：
     *
     * 输入：input = "file1.txt\nfile2.txt\nlongfile.txt"
     * 输出：12
     * 解释：根目录下有 3 个文件。
     * 因为根目录中任何东西的绝对路径只是名称本身，所以答案是 "longfile.txt" ，路径长度为 12
     */

    public int lengthLongestPath(String input) {
        if(input==null||input.length()==0) return 0;
        String[] words=input.split("\n");
        int[] pathLens=new int[words.length+1];//pathLens[i]存放第i层次的最后面的元素的路径长度
        pathLens[0]=-1;//层次最少是1，为了统一dp操作（具体看下面循环体），取pathLens[0]=-1
        int ans=0;
        //自左向右，dp
        for(String word:words){
            System.out.println(word.lastIndexOf("\t"));
            int level=word.lastIndexOf('\t')+1+1;//层次计算 字符串从0开始
            int nameLen=word.length()-(level-1);//计算名字长度
            //word的父文件夹必定目前是level-1层次的最后一个，因此pathLens[level-1]就是父文件夹路径长度
            //这个word必然是目前本层次的最后一个，因此需要刷新pathLens[level],+1是因为要加一个'\'
            pathLens[level]=pathLens[level-1]+1+nameLen;
            //如果是文件，还需要用路径长度刷新ans
            if(word.contains(".")) ans=Math.max(ans,pathLens[level]);
        }
        return ans;
    }

    public static void main(String[] args) {
        String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        D20LongestAbsoluteFile d20LongestAbsoluteFile = new D20LongestAbsoluteFile();
        System.out.println(d20LongestAbsoluteFile.lengthLongestPath(input));
    }
}

