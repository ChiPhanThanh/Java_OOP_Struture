public class Student {

    public boolean getFullName;
    // các thuộc tính:
    private String studentId;
    private String fullName;
    private float avgGrade;
    private String address;
    private String email;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }

    // constructors
    public Student() {
        fullName = "";
        avgGrade = 0;
        studentId = "";
        this.fullName = fullName;
        //...
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (!studentId.isEmpty()) { // nếu mã sv không rỗng
            this.studentId = studentId; // cập nhật mã
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (isValidName(fullName)) { // nếu tên sv k rỗng
            this.fullName = fullName; // cập nhật tên
        } else {
            System.out.println("Ten khong hop le");
        }
    }

    private boolean isValidName(String fullName) {
        // nếu tên rỗng, không hợp lệ
        if(fullName.length() == 0) {
            return false;
        }
        // nếu tên chứa kí tự số hoặc kí tự đặc biệt
        // thì không hợp lệ
        if(fullName.matches(".*[^a-zA-Z\\s]+.*")) {
            return false;
        }
        return true; // mặc định tên hợp lệ
    }

    public Student(String id) {
        studentId = id;
    }

    public Student(String id, String name) {
        studentId = id;
        fullName = name;
    }

    // methods
    public void doHomework(String subject) {
        System.out.println(fullName + " đang làm bài tập môn " + subject);
    }

    public void doExam(String subject) {
        System.out.println(fullName + " đang làm bài thi môn " + subject);
    }
    //....
}