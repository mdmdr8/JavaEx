package thisisjava.chapter06.Example;

public class Computer {
    int sum(int ... values) {
        int sum = 0;

        for (int i = 0; i < values.length; i ++){
            sum += values[i];
        }

        return sum;
    }
}
