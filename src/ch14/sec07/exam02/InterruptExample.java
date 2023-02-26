package ch14.sec07.exam02;

import ch14.sec06.exam02.ThreadA;

public class InterruptExample {
    public static void main(String[] args){
        Thread thread = new PrintThread();
        thread.start();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        thread.interrupt();
    }
}
//출력
//실행 중
//실행 중
//리소스 정리
//실행 종료

