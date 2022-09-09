package LeetCode.May;

public class D12DeleteColumns {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if(strs[i-1].charAt(j)>strs[i].charAt(j)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        D12DeleteColumns d12DeleteColumns = new D12DeleteColumns();
        System.out.println(d12DeleteColumns.minDeletionSize(new String[]{"abc", "bce", "cae"}));
    }
}
