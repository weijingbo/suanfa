package jianzhioffer;

public class replaceSpace {
    public String replaceSpace(String s) {
        s= s.replace(" ","%20");
        return s;
    }

    public String reverseLeftWords(String s, int n) {
        return s.substring(n)+s.substring(0,n);
    }

    public static void main(String[] args) {
        replaceSpace replaceSpace = new replaceSpace();
        System.out.println(replaceSpace.replaceSpace("We are happy"));
        System.out.println(replaceSpace.reverseLeftWords("abcdefg",2));
    }



}
