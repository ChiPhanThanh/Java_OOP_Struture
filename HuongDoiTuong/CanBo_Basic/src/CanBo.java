/*Bài 1. (1) Xây dựng lớp NhanVien, biết các thuộc tính của một nhân viên như sau:
-  Mã NV: kiểu số nguyên
-  Họ tên: kiểu chuỗi.
-  Địa chỉ: kiểu chuỗi.
-  CBQL: kiểu logic, có giá trị true nếu nhân viên này là cán bộ quản lý.
*/
public class CanBo {
    String maNV;
    String hoTen;
    String diaChi;
    boolean CBQL;

    public CanBo(String maNV, String hoTen, String diaChi, boolean CBQL){
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.CBQL = CBQL;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean getCBQL() {
        return CBQL;
    }

    public void setCBQL(boolean CBQL) {
        this.CBQL = CBQL;
    }
    public String Xuat(){
        return  " maNV        Ten          Diachi         CBQL";
    }
    @Override
    public String toString(){
        return maNV + "      " + hoTen+"    " + diaChi +"    " + CBQL;
    }


    public static void main(String [] args){
        CanBo canbo1 = new CanBo("1857480302A" ,"Phan Chi","Nghe An", true );
        System.out.print(canbo1.Xuat() +"\n");
        System.out.print(canbo1.toString());
    }

}
