package DesignPatterns.Factory;

public class SmsSender implements Sender{
    @Override
    public void Send() {
        System.out.println("This is SmsSender");
    }
}
