package ch14.sec08;

import ch14.sec06.exam02.ThreadA;

public class AutoSaveThread extends Thread{
    public void save(){
        System.out.println("작업 내용을 저장함.");
    }

    @Override
    public void run(){
        while (true){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                break;
            }
            save();
        }
    }
}
