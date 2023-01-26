package java.chapter06.Example;
//오버로딩
public class Rectangular {
    double areaRectangle(double width) {
        return width*width;
    }

    double areaRectangle(double width, double height) {
        return width*height;
    }
}
