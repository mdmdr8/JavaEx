package ch14.sec07.exam01;

import ch14.sec06.exam02.ThreadA;

public class SafeStopExample {
    public static void main(String[] args){
        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){}
        printThread.setStop(true);
    }
}
