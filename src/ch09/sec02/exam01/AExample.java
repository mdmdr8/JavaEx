package ch09.sec02.exam01;

public class AExample {
    public static void main(String[] args){
        // A 객체 생성
        A a = new A();

        // B 객체 생성
        A.B b = a.new B();
    }
}

// A와 같은 패키지 내에 있으므로 인스턴스 클래스 B 불러올 수 있다.
// B 클래스는 default로 선언되었기 때문이다.