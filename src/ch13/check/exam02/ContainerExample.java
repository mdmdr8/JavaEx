package ch13.check.exam02;

public class ContainerExample {
    public static void main(String[] args){
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        Integer value = container2.get();
    }
}
