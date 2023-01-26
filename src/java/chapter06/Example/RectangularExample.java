package java.chapter06.Example;

public class RectangularExample {
    public static void main (String[] args){
        Rectangular square = new Rectangular();

        double result1 = square.areaRectangle(10);
        double result2 = square.areaRectangle(10, 20);

        System.out.println("정사각형 넓이 = " + result1);
        System.out.println("직사각형 넓이 = " + result2);

    }
}
