package main;

public class AddThread extends Thread {
    int sum = 0;
    public void run () {
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println ("the summation :" + sum);
        }
    }
}
