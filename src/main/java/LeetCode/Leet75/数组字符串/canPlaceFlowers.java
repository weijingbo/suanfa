package LeetCode.Leet75.数组字符串;

public class canPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1){
            if(n==1){
                return flowerbed[0]==0;
            }
            return false;
        }
        int index =0;
        while(n>0&&index< flowerbed.length){
            if(flowerbed[index]==0){
                if(index==0){
                    if(flowerbed[index+1]==0){
                        flowerbed[index]=1;
                        n--;
                    }
                }else if(index==flowerbed.length-1){
                    if(flowerbed[index-1]==0){
                        flowerbed[index]=1;
                        n--;
                    }
                }else{
                    if(flowerbed[index+1]==0 && flowerbed[index-1]==0){
                        flowerbed[index]=1;
                        n--;
                    }
                }
            }
            index++;

        }
        return n == 0;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0}, 2));
    }
}
