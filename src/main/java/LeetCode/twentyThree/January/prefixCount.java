package LeetCode.twentyThree.January;

public class prefixCount {
    public int prefixCount(String[] words, String pref) {
        int count =0;
        for(String word :words){
            if(word.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}
