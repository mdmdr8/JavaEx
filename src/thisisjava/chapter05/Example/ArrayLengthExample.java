package thisisjava.chapter05.Example;

public class ArrayLengthExample {
    public static void main(String[] args){
        int[] scores = {84, 90, 96};

        //배열 항목의 총합 구하기
        int sum = 0;
        for(int i = 0; i<scores.length; i++){
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        double avg = (double) sum/ scores.length;
        System.out.println("평균 : " + avg);
    }
}

//출력
//총합 : 270
//평균 : 90.0
