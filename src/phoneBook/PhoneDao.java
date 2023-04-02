package phoneBook;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PhoneDao {
    private FileManager reader = new FileManager();
    private Scanner sc = new Scanner(System.in);

    //전체조회
    public void listPrint(List<List<String>> readcsv) {

        System.out.println("==============================");
        System.out.println();

        if(readcsv.size() <= 0) {
            System.out.println("등록된 연락처가 없습니다.");
        }else {
            for(int i = 0; i< readcsv.size(); i++) {
                List<String> li = readcsv.get(i);
                for(int j=0; j < li.size(); j++) {
                    System.out.print(li.get(j).toString() + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    //검색
    public void listPrint(List<List<String>> readcsv, String name) {

        System.out.println("==============================");
        System.out.println();
        System.out.println("이름을 입력하세요.");
        name = sc.next();
        int cnt =0;
        if(readcsv.size()<=0) {
            System.out.println("등록된 연락처가 없습니다.");
            System.out.println();
        }else {
            for(int i = 1; i< readcsv.size(); i++) {
                List<String> li = readcsv.get(i);
                if(li.get(0).contains(name)) {
                    for(int j=0; j < li.size(); j++) {
                        System.out.print(li.get(j).toString() + "\t");
                    }
                    cnt++;
                }
            }
            if(cnt==0) {
                System.out.println("등록된 연락처가 없습니다.");
                System.out.println();
            }
        }
        System.out.println();
    }

    //추가
    public void listPrint(List<List<String>> data,PersonInfo person) throws IOException {
        System.out.println("===============주소록 추가===============");
        System.out.println();
//			List<String> t = new ArrayList<String>();
//			t.add(person.getName());
//			t.add(person.getPhonenumber());
//			t.add(person.getEmail());
//			List<String> tt = Arrays.asList(person.getName(),person.getPhonenumber(),person.getEmail());
        System.out.print("이름 : ");
        person.setName(sc.next());
//			String name2 = sc.next();

        System.out.print("전화번호 : ");
        person.setPhonenumber(sc.next());
//			String phone = sc.next();

        System.out.print("이메일 : ");
        person.setEmail(sc.next());
//			String email = sc.next();

//			System.out.println("2번     "+person2.toString());
//			System.out.println("2번     "+System.identityHashCode(person2));
        data.add(Arrays.asList(person.getName(), person.getPhonenumber(), person.getEmail()));

        if(reader.addInfo(data)) {
            System.out.println("===============알림===============");
            System.out.println("저장에 성공했습니다.");
        }else {
            System.out.println("===============알림===============");
            System.out.println("저장에 실패했습니다.");
        }
        System.out.println();
    }
    //삭제
    public void delPrint(List<List<String>> data) throws IOException {
        //인덱스 생성
        List<Integer> idx = new ArrayList<Integer>();
        listPrint(data);
        System.out.println("==============================");
        System.out.println("삭제할 이름을 입력하세요.");
        String inputname = sc.next();
        System.out.println("===============삭제===============");

        if(data.size()<=0) {
            System.out.println("등록된 연락처가 없습니다.");
            System.out.println();
        }else {
            for(int i = 1; i< data.size(); i++) {
                List<String> li = data.get(i);
                if(li.get(0).contains(inputname)) {
                    System.out.print(i +" ");
                    idx.add(i);
                    for(int j=0; j < li.size(); j++) {
                        System.out.print(li.get(j).toString() + "\t");
                    }
                    System.out.println();
                }

            }

            if(idx.size()==0) {
                System.out.println("검색하신 이름이 없습니다.");
            }else {
                System.out.println();
                System.out.println("몇 번째 회원을 삭제하겠습니다.");
                int sel2 = sc.nextInt();
                if(idx.contains(sel2)) {
                    System.out.println("삭제하시겠습니까?");
                    System.out.println("1.예    2.아니오");
                    int sel3 = sc.nextInt();
                    if(sel3 == 1) {
                        data.remove(sel2);
                        reader.addInfo(data);
                        System.out.println("삭제되었습니다.");
                    }else if(sel3==2){
                        System.out.println("삭제가 취소되었습니다.");
                    }else {
                        System.out.println("번호가 잘못 선택되었습니다.");
                    }
                }else {
                    System.out.println("번호를 다시 선택해주세요.");
                }

            }

        }
    }

    //수정
    public void modiPrint (List<List<String>> data) throws IOException {
        //인덱스 생성
        List<Integer> idx = new ArrayList<Integer>();
        listPrint(data);
        System.out.println("==============================");
        System.out.println("수정할 이름을 입력하세요.");
        String inputname = sc.next();
        System.out.println("===============수정===============");

        if(data.size()<=0) {
            System.out.println("등록된 연락처가 없습니다.");
            System.out.println();
        }else {
            for(int i = 1; i< data.size(); i++) {
                List<String> li = data.get(i);
                if(li.get(0).contains(inputname)) {
                    System.out.print(i +" ");
                    idx.add(i);
                    for(int j=0; j < li.size(); j++) {
                        System.out.print(li.get(j).toString() + "\t");
                    }
                    System.out.println();
                }

            }

            if(idx.size()==0) {
                System.out.println("검색하신 이름이 없습니다.");
            }else {
                System.out.println();
                System.out.println("몇 번째 회원을 수정하시겠습니다.");
                int sel2 = sc.nextInt();
                if(idx.contains(sel2)) {
                    ArrayList<String> fixData = new ArrayList<String>();
                    //수정 정보 입력
                    System.out.print("이름>>");
                    String name = sc.next();
                    System.out.print("전화번호>>");
                    String phonenumber = sc.next();
                    System.out.print("이메일>>");
                    String email = sc.next();
                    System.out.println("수정하시겠습니까?");
                    System.out.println("1.예    2.아니오");
                    int sel3 = sc.nextInt();
                    if(sel3 == 1) {
                        fixData.add(name + ", " + phonenumber + ", " +email);
                        data.set(sel2,fixData);
                        reader.addInfo(data);
                        System.out.println("수정이 완료되었습니다.");
                    }else if(sel3==2){
                        System.out.println("수정이 취소되었습니다.");
                    }else {
                        System.out.println("번호가 잘못 선택되었습니다.");
                    }
                }else {
                    System.out.println("번호를 다시 선택해주세요.");
                }

            }

        }


    }
}


