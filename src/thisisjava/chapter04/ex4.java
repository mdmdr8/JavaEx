package thisisjava.chapter04;

public class ex4 {
    public static void main(String[] args){

        while(true){
            int cube1 = (int) (Math.random()*6) + 1;
            int cube2 = (int) (Math.random()*6) + 1;
            System.out.println("(" + cube1 + "," + cube2 + ")");

            if(cube1 + cube2 == 5){
                break;
            }
        }
    }
}
