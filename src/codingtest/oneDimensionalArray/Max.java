package codingtest.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Max {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int idx = 0;
        int cnt = 0;

        for(int val : arr){
            cnt++;
            if(val > max){
                max = val;
                idx = cnt;
            }
        }
        System.out.println(max);
        System.out.println(idx);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        List<Integer> newList = new ArrayList<>();
//        for(int i=0; i<9;i++){
//            newList.add(Integer.parseInt(br.readLine()));
//        }
//        int max = Collections.max(newList);
//        int idx = newList.indexOf(max);
//
//        System.out.println(max);
//        System.out.println(idx);
    }
}
