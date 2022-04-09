package erfen;

public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        int left=0,right = n;
        while(left<right){
            int mid = left+(right-left)/2;
            if((mid*(mid+1))/2>n) right = mid-1;
            if((mid*(mid+1))/2<n) left = mid+1;
            if((mid*(mid+1))/2==n) return mid;
        }
        return  left;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(2));
    }
}
