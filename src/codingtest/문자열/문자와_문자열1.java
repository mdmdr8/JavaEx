package codingtest.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자와_문자열1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        String s = str.nextToken();
        int i = Integer.parseInt(str.nextToken());
        System.out.println(s.charAt(i-1));
    }
}
