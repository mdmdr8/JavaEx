package ch09.sec03.exam02;

public class AExample {
    public static void main(String[] args) {
        A.B b = new A.B();
        System.out.println(b.field1);
        b.metheod1();

        System.out.println(A.B.field2);
        A.B.metheod2();
    }
}
