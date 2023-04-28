package codingtest.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BallChange {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        for(int i=0; i<m; i++){
            int temp = 0;
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            temp = arr[num1-1];
            arr[num1-1] = arr[num2-1];
            arr[num2-1] = temp;
        }
        sc.close();
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
