package main;

public class SubThread extends Thread {
    int diff = 0;
    public void run () {
        for (int i = 10; i >= 10; i--) {
            diff -= i;
            System.out.println ("the substraction is :" + diff);
        }
    }
}
