package thisisjava.chapter06.Example;

public class CalculatorExample {
    public static void main(String[] args){

        //객체 생성
        Calculator myCalc = new Calculator();

        //메소드 호출
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1: " + result1);

        int x = 1;
        int y = 4;

        double result2 = myCalc.divide(x, y);
        System.out.println("result2 : " + result2);

        myCalc.powerOff();
    }
}
