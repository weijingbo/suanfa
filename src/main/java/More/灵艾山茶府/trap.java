package More.灵艾山茶府;

public class trap {
    public static int trap(int[] height) {
        int n = height.length;
        int[] pre = new int[n],suf = new int[n];
        pre[0] = height[0];
        suf[n-1] = height[n-1];
        for (int i = 1; i < n; i++) {
            pre[i] = Math.max(pre[i-1],height[i]);
        }
        for (int i = n-2; i >=0; i--) {
            suf[i] = Math.max(suf[i+1],height[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans+=Math.min(pre[i],suf[i]) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
