package java.chapter05.Example;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args){
        int[][] mathScores = {
            {80, 83, 85},
            {86, 90, 92}
        };

        int totalStudent = 0;
        int totalMathSum = 0;

        for (int i = 0; i< mathScores.length; i++){
            totalStudent += mathScores[i].length;
            for (int k = 0; k < mathScores[i].length; k++){
                totalMathSum += mathScores[i][k];
            }
        }
        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        for(int i=0; i<englishScores.length; i++){
            for (int k = 0; k<englishScores[i].length; k++){
                System.out.println("englishScore[" + i + "][" + k + "]: " + englishScores[i][k]);
            }
        }
        System.out.println();

        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;

        totalStudent = 0;
        int totalEnglishSum = 0;
        for (int i=0; i<englishScores.length; i++){
            totalStudent += englishScores[i].length;
            for (int k=0; k<englishScores[i].length; k++){
                totalMathSum += englishScores[i][k];
            }
        }
        double totalEnglishAvg = (double) totalEnglishSum/totalStudent;
        System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
    }
}
