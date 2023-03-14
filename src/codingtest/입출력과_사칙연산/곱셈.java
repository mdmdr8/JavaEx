package codingtest.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();


        int first = Integer.parseInt(s1);
        char[] second = s2.toCharArray();

        System.out.println(first*(second[2]-'0'));
        System.out.println(first*(second[1]-'0'));
        System.out.println(first*(second[0]-'0'));
        System.out.println(first*Integer.parseInt(s2));

    }
}

