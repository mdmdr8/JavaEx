package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args){
        //스레드풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        //작업 생성과 처리 요청
        //스레드풀 종료
        executorService.shutdownNow();
    }
}

//스레드풀에 생성된 스레드가 없기 때문에,
//작업 생성과 처리 요청 코드가 없기에 10라인을 실행하지 않아도 프로세스가 종료된다.

