package codingtest.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AB_division {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        Double A = Double.parseDouble(str.nextToken());
        Double B = Double.parseDouble(str.nextToken());

        System.out.println(A/B);
    }
}
