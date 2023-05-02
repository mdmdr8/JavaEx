package codingtest.문자열;

import java.util.Scanner;

public class 문자와_문자열2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StringBuilder s = new StringBuilder(sc.nextLine());
        int i = sc.nextInt();

        System.out.println(s.charAt(i-1));
    }
}
