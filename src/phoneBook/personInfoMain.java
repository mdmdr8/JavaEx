package phoneBook;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class personInfoMain {
    private static FileManager reader = new FileManager();
    private static List<List<String>> data = null;
    private static PhoneDao dao = new PhoneDao();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException{
        while(true) {
            try {
                data = reader.readCSV();
                System.out.println("========== 주소록 ==========");
                System.out.println("[1] 전체 조회");
                System.out.println("[2] 검색");
                System.out.println("[3] 추가");
                System.out.println("[4] 수정");
                System.out.println("[5] 삭제");
                System.out.println("[6] 종료");
                System.out.print("입력 : ");
                String name="";
                PersonInfo person = new PersonInfo();


                int sel = sc.nextInt();

                switch(sel) {

                    //전체조회
                    case 1:
                        dao.listPrint(data);
                        break;

                    //검색
                    case 2:
                        dao.listPrint(data,name);
                        break;

                    //추가
                    case 3:
                        //dao.listPrint(person);
                        dao.listPrint(data,person);
                        break;

                    //수정
                    case 4:
                        dao.modiPrint(data);
                        break;

                    //삭제
                    case 5:
                        dao.delPrint(data);
                        break;

                    //종료
                    case 6:
                        return;
                    default:
                        break;
                }

            }catch(Exception e) {
                System.out.println("1~6 정수만 입력해주세요");
                sc.next();
            }
        }
    }
}




