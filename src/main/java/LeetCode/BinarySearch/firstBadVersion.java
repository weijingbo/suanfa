package LeetCode.BinarySearch;

public class firstBadVersion {
    public static Integer bad;
    public static Boolean isBadVersion(int n){
        if (n<bad){
            return false;
        }else {
            return true;
        }
    }
    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while(low<high){
            int mid = low+(high-low)/2;
            if(!isBadVersion(mid-1)&&isBadVersion(mid)){
                return mid;
            }else if(!isBadVersion(mid-1)&&!isBadVersion(mid)){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        bad = 3;
        System.out.println(firstBadVersion(5));
    }
}
