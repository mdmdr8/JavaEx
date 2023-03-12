package codingtest.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 꼬마정민 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        long a = Long.parseLong(s.nextToken());
        long b = Long.parseLong(s.nextToken());
        long c = Long.parseLong(s.nextToken());

        System.out.println(a+b+c);

    }
}
