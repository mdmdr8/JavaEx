package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args){
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();

        //또는
        //RemoteControl rc = new Television();

        rc = new Audio();
        rc.turnOn();
    }
}
//출력
//TV를 켭니다.

//출력
//TV를 켭니다.
//Audio를 켭니다.