public class Student {
    String firstNam;
    String lastName;
    String homeAddress;
    String schoolAddress;
    Address address;

    public Student(String firstNam, String lastName, String homeAddress, String schoolAddress, Address address) {
        this.firstNam = firstNam;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
        this.address = address;
    }

    public String getFirstNam() {
        return firstNam;
    }

    public void setFirstNam(String firstNam) {
        this.firstNam = firstNam;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }
     @Override
    public  String toString(){
        return firstNam + "  " + lastName + "  " + homeAddress + " " + schoolAddress ;
    }
}
