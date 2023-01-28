package thisisjava.chapter06.Example;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
//    int speed;

    //생성자 선언1
    Car() {}

    //생성자 선언2
    Car(String model, String color){
        this(model, color, 250);
    }
    //생성자 선언3
    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
