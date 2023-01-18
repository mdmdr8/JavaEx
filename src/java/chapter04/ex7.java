package java.chapter04;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int keyCode = 0;
        int money = 0;
        boolean answer = true;


        while(answer){
            if(keyCode!=13 && keyCode!=10) {
                System.out.println("-------------------------------");
                System.out.println("1.예금 | 2.출금| 3.잔고| 4.종료");
                System.out.println("-------------------------------");
                System.out.println("선택>" );

                keyCode = System.in.read();
            }

            if(keyCode == 49){
                money+= scanner.nextInt();
                System.out.println("예금액>" + money);
            }
            else if (keyCode == 50){
                money-= scanner.nextInt();
                System.out.println("출금액>" + money);

            }
            else if(keyCode == 51){
                System.out.println("잔고>" + money);

            }
            else if(keyCode == 52){
                answer=false;
            }
            System.out.println("프로그램 종료");

        }
    }
}
