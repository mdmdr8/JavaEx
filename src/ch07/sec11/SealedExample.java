package ch07.sec11;

import ch07.sec6.package2.D;

public class SealedExample {
    public static void main(String[] args){
        Person p = new Person();
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        p.work();
        e.work();
        m.work();
        d.work();

    }
}
//출력
/*
하는 일이 결정되지 않았습니다.
제품을 생산합니다.
생산 관리를 합니다.
제품을 기획합니다.
*/
