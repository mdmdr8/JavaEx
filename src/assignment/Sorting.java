package assignment;
//String[] sort(String[] data)
//alphabetical order로 sorting하는 거

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){
        String[] name = {"Rahul", "Ajay", "Gourav", "Riya"};
        Arrays.sort(name);
        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
    }
}
