package thisisjava.chapter05.check;

public class ex8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int len = 0;
        double avg = 0.0;

        for(int i = 0; i < array.length; i++){
            len += array[i].length;
            for(int j = 0; j < array[i].length; j++)
                sum += array[i][j];
        }
        avg = (double) sum/len;
        System.out.println("전체 합: " + sum);
        System.out.println("평균 : " + avg);
    }
}
