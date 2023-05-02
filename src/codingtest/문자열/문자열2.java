package codingtest.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String word = br.readLine();
            int idx = word.length()-1;

            System.out.println(String.valueOf(word.charAt(0)) + String.valueOf(word.charAt(idx)));
        }
    }
}
