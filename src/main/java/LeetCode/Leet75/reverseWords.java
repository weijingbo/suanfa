package LeetCode.Leet75;

public class reverseWords {
    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length-1; i >=0; i--) {
            System.out.println(strings[i]);
           if(!strings[i].contains(" ")){
               sb.append(strings[i]);
               sb.append(" ");
           }
        }
        int index = sb.lastIndexOf(" ");
        sb.deleteCharAt(index);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
}
