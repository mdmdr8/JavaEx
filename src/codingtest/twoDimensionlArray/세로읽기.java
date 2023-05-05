package codingtest.twoDimensionlArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] li = new char[5][15];
        StringBuilder sb= new StringBuilder();

        for(int i=0; i<5; i++){
            String s = br.readLine();
            for(int j=0; j<s.length(); j++){
                li[i][j] =s.charAt(j);
            }
        }

        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(li[j][i] != '\0')
                    sb.append(li[j][i]);
            }
        }
        System.out.println(sb);
    }
}
