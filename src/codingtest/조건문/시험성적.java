package codingtest.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 시험성적 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        System.out.println((score>=90)? "A": (score>=80)? "B": (score>=70)? "C": (score>=60)? "D": "F");

    }
}
