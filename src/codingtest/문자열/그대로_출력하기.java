package codingtest.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그대로_출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();
            if(str == null || str.isEmpty()){
                break;
            }
            sb.append(str).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
