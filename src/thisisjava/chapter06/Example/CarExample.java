package thisisjava.chapter06.Example;

public class CarExample {
    public static void main (String[] args){
        //객체 생성
        Car myCar = new Car();

        //객체의 필드값 읽기
        System.out.println("제작 회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
//        System.out.println("현재속도: " + myCar.speed);

        //객체의 필드갑 변경
//        myCar.speed = 60;
//        System.out.println("수정된 속도" + myCar.speed);

        Car car1 = new Car();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        Car car2 = new Car("자가용", "빨강");
        System.out.println("car1.company : " + car2.company);
        System.out.println("car1.model : " + car2.model);
        System.out.println("car1.color : " + car2.color);
        System.out.println();

        Car car3 = new Car("택시", "검정", 200);
        System.out.println("car1.company : " + car3.company);
        System.out.println("car1.model : " + car3.model);
        System.out.println("car1.color : " + car3.color);
        System.out.println("car1.maxSpeed : " + car3.maxSpeed);
        System.out.println();

    }
}