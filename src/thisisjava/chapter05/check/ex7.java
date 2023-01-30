package thisisjava.chapter05.check;

public class ex7 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int temp = Integer.MIN_VALUE; //최소값

        for (int i = 0; i < array.length; i++){
            if(array[i] > temp){
                temp = array[i];
            }
        }
        System.out.println(temp);
    }
}
