package assignment;

public class bsortEx {
    public static void main(String[] args) {
        int[] arr = new int[]{3,6,41,2,4,1,5,743};
        bubbleSorting.bubble_sort(arr);
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}
