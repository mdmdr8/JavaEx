package ch14.sec09.exam03;

import java.util.concurrent.*;

public class CallableSubmitExample {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=1; i<=100; i++){
            final int idx = i;
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for(int j=1;j<=idx; j++){
                        sum += j;
                    }
                    Thread thread = Thread.currentThread();
                    System.out.println("[" + thread.getName() + "] 1~" +idx + " 합 계산");
                    return sum;
                }
            });

            try{
                int result = future.get();
                System.out.println("|t리턴값: " + result);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}

//출력
//... [pool-1-thread-3] 1~98 합 계산
//|t리턴값: 4851
//[pool-1-thread-4] 1~99 합 계산
//|t리턴값: 4950
//[pool-1-thread-5] 1~100 합 계산
//|t리턴값: 5050