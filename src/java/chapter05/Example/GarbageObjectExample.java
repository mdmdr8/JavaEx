package java.chapter05.Example;

public class GarbageObjectExample {
    public static void main(String[] args){
        String hobby = "여행";
        hobby = null; //"여행"dp goekdgksms String 객체를 쓰레기로 만듦

        String kind1 = "자동차";
        String kind2 = kind1; //kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
        kind1 = null; //"자동차"에 해당하는 String 객체는 쓰레기가 아님
        System.out.println("kind2: " + kind2);
    }
}

//출력 : kind1 변수에 null을 대입한다고 해서 쓰레기가 되지 않는다. kind2 변수가 여전히 참조하고 있기 떄문이다.
//kind2 : 자동차