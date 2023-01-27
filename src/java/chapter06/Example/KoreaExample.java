package java.chapter06.Example;

public class KoreaExample {
    public static void main(String[] args){
        //객체 생성 시 주민등록번호와 이름 전달
        Korea k1 = new Korea("123456-1234567", "감자바");

        //필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //Final 필드는 값을 변경할 수 없음
    }
}
