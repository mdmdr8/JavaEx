package ch08.sec05;


public class RemoteControlExample {
    public static void main(String[] args){
        RemoteControl rc;


        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);
    }
}
//출력
// Audio를 켭니다.
//현재 Audio 볼륨: 5
//무음 처리합니다.
//현재 Audio 볼륨: 0
//무음 해제합니다.
//현재 Audio 볼륨: 5