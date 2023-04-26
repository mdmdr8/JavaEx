package codingtest.조건문;

import java.util.StringTokenizer;

public class 토큰사용법 {
    public static void main(String[] args){
        String str = "this string\tincludes\ndefault delims";
        StringTokenizer stk = new StringTokenizer(str);
        System.out.println(str);
        System.out.println();

        System.out.println("total tokens : " + stk.countTokens() );

       while(stk.hasMoreElements()){
           System.out.println(stk.nextToken());
       }
        System.out.println("total tokens : " + stk.countTokens());

    }

}

