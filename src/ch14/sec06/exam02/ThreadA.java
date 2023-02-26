package ch14.sec06.exam02;

import ch07.sec7.exam03.Parent;

public class ThreadA extends Thread{
    private WorkObject workObject;

    public ThreadA(WorkObject workObject) {
        setName("ThreadA");
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            workObject.methodA();
        }
    }
}

