package LC.easy;

public class closeTarget {
    public static int closetTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        for (int i = 0; i < words.length; i++) {
            int pre_index = (startIndex+i)%n;
            if(words[pre_index].equals(target)){
                return Math.min(i,n-i);
            }
            int next_index = (startIndex-i)%n;
            if(words[next_index].equals(target)){
                return Math.min(i,n-i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       String[] words = new String[]{"hello","i","am","leetcode","hello"};
       String target = "hello";
       int startIndex = 1;
        System.out.println(closetTarget(words,target,startIndex));
    }
}
