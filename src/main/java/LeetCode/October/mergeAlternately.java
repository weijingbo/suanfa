package LeetCode.October;

public class mergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int k=0;
        int length = Math.min(word1.length(),word2.length());
        while(k<length){
            sb.append(word1.charAt(k));
            sb.append(word2.charAt(k));
            k++;
        }
        if(word1.length()<word2.length()){
            sb.append(word2.substring(k));
        }else {
            sb.append(word1.substring(k));
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        mergeAlternately mergeAlternately = new mergeAlternately();
        System.out.println(mergeAlternately.mergeAlternately("abc","pqr"));
    }
}
