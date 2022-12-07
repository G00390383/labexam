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
        if(name.length() >= 5 && name.length() <= 22){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid name entered");
        }
    }

    public int getPpsn() {
        return ppsn;
    }

    public void setPpsn(int ppsn) {
        if(ppsn >= 100000 && ppsn < 1000000){
            this.ppsn = ppsn;
        }
        else{
            throw new IllegalArgumentException("Invalid ppsn entered");
        }
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        if(phone >= 10000000000L && phone < 100000000000L){
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("Invalid phone entered");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if("man".equalsIgnoreCase(this.gender)||"woman".equalsIgnoreCase(this.gender)||"non-binary".equalsIgnoreCase(this.gender)){
            this.gender = gender;
        }
        else{
            throw new IllegalArgumentException("Invalid gender entered");
        }
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        if("full-time".equalsIgnoreCase(this.empType)||"part-time".equalsIgnoreCase(this.empType)){
            this.empType = empType;
        }
        else{
            throw new IllegalArgumentException("Invalid employement type entered");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
