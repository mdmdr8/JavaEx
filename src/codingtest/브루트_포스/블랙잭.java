package codingtest.브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        ArrayList<Integer> li = new ArrayList<>();

        StringTokenizer num = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            li.add(Integer.parseInt(num.nextToken()));
        }
        int rs = search(li, n, m);
        System.out.println(rs);
    }

    static int search(ArrayList<Integer> li, int n, int m){
        int rs = 0;
        // 3개를 고르기 떄문에 첫번쨰 카드는 n-2까지만 순회
        for(int i=0; i<n-2; i++){
            // 첫 번째 카드가 m보다 크면 skip
            if(li.get(i) > m) continue;
            // 두 번째 카드는 컷 번째 카드 다음부터 n-1까지만 순회
            for(int j=i+1; j<n-1; j++){
                if(li.get(i) + li.get(j) > m) continue;
                // 세 번째 카드는 두 번쨰 카드 다음부터 n까지 순회
                for(int k=j+1; k<n; k++){
                    int temp = li.get(i) + li.get(j) + li.get(k);
                    if(m == temp){
                        return temp;
                    }

                    if(rs < temp && temp < m){
                        rs = temp;
                    }
                }
            }
        }
        return rs;
    }
}
