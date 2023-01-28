package ch07.sec8.exam02;

import ch07.sec6.package2.D;
import ch07.sec8.exam01.Tire;

public class DriverExample {
    public static void main(String[] args){
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        //매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}

//출력
// 버스가 달립니다.
// 택시가 달립니다.