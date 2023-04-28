package codingtest.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BallChange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        System.out.println(n);
        System.out.println(m);

        int[] arr = new int[n];
        // 처음 바구니에 담긴 값
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        //변경 값
        for(int i=0; i<m; i++){
            StringTokenizer str1 = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(str1.nextToken());
            int num2 = Integer.parseInt(str1.nextToken());
            int temp = 0;

            temp = arr[num1-1];
            arr[num1-1] = arr[num2-1];
            arr[num2-1] = temp;

        }
        for(int number : arr){
            System.out.print(number + " ");
        }
    }
}
