package LeetCode.TwentyThree.May;

public class countTime {
    public static int countTime(String time) {
        char[] chars = time.toCharArray();
        int hour,minuter;
        //小时的处理
        if(chars[0]=='?'){
            if(chars[1]=='?'){
                hour = 24;
            }else if(chars[1]<'4'){
                hour = 3;
            }else{
                hour = 2;
            }
        }else if(chars[1]=='?'){
            if(chars[0]=='2'){
                hour = 4;
            }else{
                hour = 10;
            }
        }else {
            hour = 1;
        }
        //分钟的处理
        if(chars[3]=='?'){
            if(chars[4]=='?'){
                minuter = 60;
            }else{
                minuter = 6;
            }
        }else if(chars[4]=='?'){
            minuter = 10;
        }else {
            minuter =1;
        }
        return hour*minuter;
    }

    public static void main(String[] args) {
        System.out.println(countTime("0?:0?"));
    }
}
