package codingtest.twoDimensionlArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬_덧셈1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        //첫 번째 배열
        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(str.nextToken());
            }
        }
        //두 번째 배열
        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(str.nextToken());
            }
        }
        //두 배열 합해서 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append((arr1[i][j] + arr2[i][j]) + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
