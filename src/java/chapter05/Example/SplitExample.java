package java.chapter05.Example;

public class SplitExample {
    public static void main(String[] args){
        String board = "1,자바 학습, 참조 타입 String을 학습한다.,홍길동";

        //문자열 분리
        String[] token = board.split(",");

        //인덱스별로 읽기
        System.out.println("번호" + token[0]);
        System.out.println("제목" + token[1]);
        System.out.println("내용" + token[2]);
        System.out.println("성명" + token[3]);
        System.out.println();

        //for 문을 이용한 읽기
        for(int i =0; i<token.length;i++){
            System.out.println(token[i]);
        }
    }
}

//출력

