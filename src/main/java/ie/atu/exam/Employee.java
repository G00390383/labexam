package ie.atu.exam;

public class Employee {
    String name;
    int ppsn;
    long phone;
    String gender;
    String empType;
    int age;

    public Employee(String name, int ppsn, long phone, String gender, String empType, int age){
        this.name = name;
        this.ppsn = ppsn;
        this.phone = phone;
        this.gender = gender;
        this.empType = empType;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPpsn() {
        return ppsn;
    }

    public void setPpsn(int ppsn) {
        this.ppsn = ppsn;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
