package java.chapter05.Example;

public class ArrayCopyByForExample {
    public static void main(String[] args){
        int[] oldArray = {1,2,3};
        int[] newArray = new int[5];

        for(int i=0; i<oldArray.length;i++){
            newArray[i] = oldArray[i];
        }
        for(int i=0; i<newArray.length; i++){
            System.out.println(newArray[i]+", ");
        }
    }
}
//출력
//1, 2, 3, 0, 0,
