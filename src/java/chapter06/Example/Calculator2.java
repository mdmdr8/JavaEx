package java.chapter06.Example;

public class Calculator2 {
    String color; //인스턴스 필드
    void setColor (String color) {this.color = color;} //인스턴스 메소드
    static int plus(int x, int y) {return x + y;} //정적 메소드
    static int minus(int x, int y) {return x - y;} //정적 메소드
}
