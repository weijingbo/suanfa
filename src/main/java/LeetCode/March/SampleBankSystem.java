package LeetCode.March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleBankSystem {
    Long[] accounts;

    public SampleBankSystem(Long[] balance) {
        int n = balance.length;
        accounts = new Long[n+1];
        for (int i = 0; i < n; i++) {
            accounts[i+1] = balance[i];
        }
    }

    public boolean transfer(int account1, int account2, long money) {
        if(withdraw(account1,money)){
            deposit(account2,money);
            return true;
        }
        return false;
    }

    public boolean deposit(int account, long money) {
        accounts[account] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        long temp = accounts[account];
        if(temp>money){
            accounts[account] -= money;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Long[] balance = new Long[]{10L, 100L, 20L, 50L, 30L};
        SampleBankSystem obj = new SampleBankSystem(balance);
//        boolean param_1 = obj.transfer(5,1,20);
//        boolean param_2 = obj.deposit(5,20);
//        boolean param_3 = obj.withdraw(3,10);
    }
}
