package codingtest.입출력과_사칙연산;

import ch07.sec6.package1.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 곱셈2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer first = Integer.parseInt(br.readLine());
        Integer second = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(first*(second%10));
        System.out.println(first*((second%100)/10));
        System.out.println(first*(second/100));
        System.out.println(first*second);
    }
}
