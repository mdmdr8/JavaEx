package ch07.sec3.exam01;

public class SmartPhoneExample {
    public static void main(String[] args){
        SmartPhone myPhone = new SmartPhone("아이폰", "옐로우");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }
}
