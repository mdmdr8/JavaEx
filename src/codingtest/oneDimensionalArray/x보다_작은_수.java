package codingtest.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class x보다_작은_수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        //n개의 배열을 입력받을 두번째 줄
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num < x){
                sb.append(num).append(" ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
