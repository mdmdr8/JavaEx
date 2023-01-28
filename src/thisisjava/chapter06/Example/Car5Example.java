package thisisjava.chapter06.Example;

public class Car5Example {
    public static void main(String[] args){
        //객체 생성
        Car5 myCar = new Car5();

        //잘못된 속도 변경
        myCar.setSpeed(-50);
        System.out.println("현재 속도: " + myCar.getSpeed());

        //올바른 속도 변경
        myCar.setSpeed(60);
        System.out.println("현재 속도: " + myCar.getSpeed());

        //멈춤
        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("현재 속도: " + myCar.getSpeed());
    }
}

//출력
//현재 속도: 0
//현재 속도: 60
//현재 속도: 0