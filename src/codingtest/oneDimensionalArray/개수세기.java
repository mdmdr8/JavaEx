package codingtest.oneDimensionalArray;

import java.io.*;
import java.util.StringTokenizer;

public class 개수세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        StringTokenizer token = new StringTokenizer(br.readLine());

        int cnt = 0;
        int v = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(token.nextToken());
            if(v==array[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();

    }
}
