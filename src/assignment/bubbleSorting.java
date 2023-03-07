package assignment;

public class bubbleSorting {
    public static void bubble_sort(int[] data) {
        bubble_sort(data, data.length);
    }
    private static void bubble_sort(int[] data, int size){
        // round는 배열 크기 - 1 만큼 진행됨
        for(int i=1; i < size; i++){
            // 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
            for(int j = 0; j < size-i; j++){

                if(data[j] > data [j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }
    }
    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}

