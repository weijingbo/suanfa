package LeetCode.March;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class LongestWordInDictionary {
    /**
     *给出一个字符串数组 words 组成的一本英语词典。返回 words 中最长的一个单词，该单词是由 words 词典中其他单词逐步添加一个字母组成。
     *
     * 若其中有多个可行的答案，则返回答案中字典序最小的单词。若无答案，则返回空字符串。
     *
     *
     * 示例 1：
     *
     * 输入：words = ["w","wo","wor","worl", "world"]
     * 输出："world"
     * 解释： 单词"world"可由"w", "wo", "wor", 和 "worl"逐步添加一个字母组成。
     * 示例 2：
     *
     * 输入：words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
     * 输出："apple"
     * 解释："apply" 和 "apple" 都能由词典中的单词组成。但是 "apple" 的字典序小于 "apply"
     */
    public String longestWord(String[] words) {
        int n = words.length;
        Arrays.sort(words, (a,b)->{
            if (a.length() != b.length()) {
                return a.length() - b.length(); //数据短的在前面
            } else {
                return b.compareTo(a);
            }
        });
        HashSet<String> set = new HashSet<>();
        String longword = "";
        set.add(longword);
        for (int i = 0; i < n; i++) {
            if(set.contains(words[i].substring(0,words[i].length()-1))){
                longword = words[i];
                set.add(words[i]);
            }
        }
        return longword;
    }

    public static void main(String[] args) {
        LongestWordInDictionary longestWordInDictionary = new LongestWordInDictionary();
        System.out.println(longestWordInDictionary.longestWord(new String[]{ "a", "b", "app", "appl", "ap", "apply", "apple","ba","ban","bana","banan"}));
    }
}
