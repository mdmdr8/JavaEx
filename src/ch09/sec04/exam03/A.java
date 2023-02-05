package ch09.sec04.exam03;

public class A {
    public void mathod1(int arg){

        // 로컬 변수 : final int var = 1;
        int var = 1;

        // 로컬 클래스
        class B {
            void method2(){
                // 로컬 변수 일기
                System.out.println("arg: " + arg);
                System.out.println("var: " + var);
            }
        }
        B b = new B();
        b.method2();
    }
}
