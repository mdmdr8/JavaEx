package codingtest.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바구니_뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        //바구니 만들기
        Integer[] bascket = new Integer[n];

        for(int i = 0; i < n; i++){
            bascket[i] = i+1;
        }

        //바구니 순서 바꾸기
        for(int i = 0; i<m; i++){
            StringTokenizer str1 = new StringTokenizer(br.readLine());
            int fir = Integer.parseInt(str1.nextToken());
            int sec = Integer.parseInt(str1.nextToken());

            if(fir < sec){
                int[] temp = new int[sec-fir+1];
                //temp에다가 역순 범위에 값 넣어주고
                for(int j = 0; j<temp.length; j++){
                    temp[j] = bascket[sec-1-j] ;
                }
                //temp
                for(int k = 0; k<sec-fir+1; k++){
                    bascket[fir+k-1] = temp[k];
                }
            }

        }
        for(int l=0;l<n; l++){
            System.out.print(bascket[l] + " ");
        }
    }
}
