package assignment;
//삽입정렬
//alphabetical order로 sort하는 함수 로직 짜기

public class insertSorting {
    public static String[] isort(String[] data){
        String temp = "";

        for(int k = 1; k < data.length; k++){
            String name = data[k];
            int i = k-1;


            while( i >= 0 && data[i].compareToIgnoreCase(data[i+1]) > 0){
                temp = data[i];
                data[i] = data[i+1];
                data[i+1] = temp;
                i--;
            }
        }
        for(int j = 0 ; j < data.length; j++){
            System.out.println(data[j]);
        }
    return data;
    }

}


