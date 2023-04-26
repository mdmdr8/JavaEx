package codingtest.oneDimensionalArray;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Recipe {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int total = Integer.parseInt(br.readLine());
        int type = Integer.parseInt(br.readLine());;

        int sum = 0;
        for(int i = 0; i < type; i++) {
            st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
        }

        if(total == sum) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
        br.close();
    }

}

