package java.chapter06.Example;

public class Korea {
    //인스턴스 final 필드 선언
    final String nation = "대한민국";
    final String ssn;

    //인스턴스 필드 선언
    String name;

    //생성자 선언
    public Korea (String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
}
