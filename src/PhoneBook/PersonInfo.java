package PhoneBook;

public class PersonInfo {
    private String name;
    private String phonenumber;
    private String email;

    // 생성자
    public PersonInfo(String name, String phonenumber, String email) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    // 기본 생성자
    public PersonInfo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + "," + phonenumber + "," + email;
    }
}