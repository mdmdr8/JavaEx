package codingtest.twoDimensionlArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬_덧셈2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        int[][] arr = new int[n][m];
        for(int k=0; k<2; k++){
            for(int i=0; i<n; i++){
                str = new StringTokenizer(br.readLine());
                for(int j=0; j<m; j++){
                    arr[i][j] += Integer.parseInt(str.nextToken());
                }
            }
        }
        //출력
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
