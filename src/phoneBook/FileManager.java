package phoneBook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileManager {
    private List<List<String>> csvList = new ArrayList<List<String>>();
    int serialNum = 0;


    public Integer idx() {
        return serialNum++;
    }


    public List<List<String>> readCSV() {
//	        List<List<String>>
        csvList = new ArrayList<List<String>>();
        File csv = new File("src/전화번호부.csv");
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csv));
            while ((line = br.readLine()) != null) { // readLine()은 파일에서 개행된 한 줄의 데이터를 읽어온다.
                List<String> aLine = new ArrayList<String>();

                String[] lineArr = line.split(","); // 파일의 한 줄을 ,로 나누어 배열에 저장 후 리스트로 변환한다.
                aLine = Arrays.asList(lineArr);
                csvList.add(aLine);
                //System.out.println(aLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지 않습니다.");
        } finally {
            try {
                if (br != null) {
                    br.close(); // 사용 후 BufferedReader를 닫아준다.
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return csvList;
    }

    //추가
    public static boolean addInfo(List<List<String>> data) throws IOException {
        File csv = new File("src/전화번호부.csv");
        //false 덮어쓰기, true는 이어쓰기
        BufferedWriter bw = new BufferedWriter(new FileWriter(csv, false));

        for (int i = 0; i < data.size(); i++) {
            List<String> li = data.get(i);
            for (int j = 0; j < li.size(); j++) {
                bw.write(li.get(j) + ",");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        return true;


    }
}