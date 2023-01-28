package ch07.sec8.exam01;


public class CarExample {
    public static void main(String[] args){

        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}

//출력
//회전합니다.
//한국 타이어가 회전합니다.
//금호 타이어가 회전합니다.