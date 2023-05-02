package codingtest.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 나머지 {
    public static void main(String[] args) throws IOException {

        HashSet<Integer> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<10; i++){
            set.add(Integer.parseInt(br.readLine()) % 42);

        }
        System.out.println(set.stream().count());
    }
}
