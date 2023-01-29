package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args){

        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
//출력
// TV를 켭니다.
//현재 TV 볼륨: 5
//TV를 끕니다.
//
//Audio를 켭니다.
//현재 Audio 볼륨: 5
//Audio를 끕니다.