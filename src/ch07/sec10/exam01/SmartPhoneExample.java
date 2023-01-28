package ch07.sec10.exam01;

public class SmartPhoneExample {
    public static void main(String[] args){
        //Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("박자바");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
////출력
//폰 전원을 켭니다.
//인터넷 검색을 합니다.
//폰 전원을 끕니다.