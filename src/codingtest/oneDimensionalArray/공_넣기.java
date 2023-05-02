package codingtest.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공_넣기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        //바구니
        int n = Integer.parseInt(str.nextToken());
        Integer[] basket = new Integer[n];

        //공 넣으려는 횟수
        int m = Integer.parseInt(str.nextToken());
        //우선 0을 넣어주고
        for(int i=0; i<n; i++){
            basket[i] =0;
        }
        // 공을 넣으려는 입력 값
        for(int i=0; i<m; i++){
//            int[] temp = new int[m];
            StringTokenizer str1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str1.nextToken());
            int b = Integer.parseInt(str1.nextToken());
            int k = Integer.parseInt(str1.nextToken());

            for(int j=0; j<b-a+1; j++){
                basket[a+j-1] = k;
            }

        }
        for(int i =0; i<n; i++){
            System.out.print(basket[i] + " ");
        }

    }
}
