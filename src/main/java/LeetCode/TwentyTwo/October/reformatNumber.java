package LeetCode.TwentyTwo.October;

public class reformatNumber {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            Character c = number.charAt(i);
            if(Character.isDigit(c) ){
                sb.append(i);
            }
        }

        int n = sb.length();
        return null;
    }
}
