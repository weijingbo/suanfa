package LeetCode.zhitongche;

public class FindKthBit {
    public char findKthBit(int n, int k) {
        if(n == 1)
            return '0';
        int mid = 1 << (n-1);
        if(k < mid)
            return findKthBit(n-1, k);
        else if(k == mid)
            return '1';
        else{
            k = 2*mid - k;
            return findKthBit(n-1, k) == '0' ? '1' : '0';
        }
    }

    public static void main(String[] args) {
        FindKthBit findKthBit = new FindKthBit();
        System.out.println(findKthBit.findKthBit(3,5));
    }
}
