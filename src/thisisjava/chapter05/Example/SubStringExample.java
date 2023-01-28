package thisisjava.chapter05.Example;

public class SubStringExample {
    public static void main(String[] args){
        String ssn = "880815-1234567";

        String fisrstNum = ssn.substring(0,6);
        System.out.println(fisrstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}

//출력
//880815
//1234567
