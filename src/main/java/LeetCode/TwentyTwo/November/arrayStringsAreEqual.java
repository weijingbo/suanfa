package LeetCode.TwentyTwo.November;

public class arrayStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String word : word1) {
            sb1.append(word);
        }
        for (String word : word2) {
            sb2.append(word);
        }
        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        arrayStringsAreEqual arrayStringsAreEqual = new arrayStringsAreEqual();
        System.out.println(arrayStringsAreEqual.arrayStringsAreEqual(new String[]{"a","bc"},new String[]{"ab","c"}));
    }
}
