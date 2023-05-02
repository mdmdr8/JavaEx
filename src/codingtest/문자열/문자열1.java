package codingtest.문자열;

import java.util.Scanner;

public class 문자열1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        //테스트 케이스의 개수
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String word = sc.next();
            int idx = word.length()-1;
            sb.append(word.charAt(0));
            sb.append(word.charAt(idx)+ "\n");
        }
        System.out.println(sb);
    }
}
