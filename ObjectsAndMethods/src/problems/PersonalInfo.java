package problems;

public class PersonalInfo {
    private String name, address, phoneNum;
    private int age;

    public PersonalInfo() {
        age = 0;
        name = "";
        address = "";
        phoneNum = "";
    }

    public PersonalInfo(String name, int age, String phoneNum) {
        this.age = age;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

}
