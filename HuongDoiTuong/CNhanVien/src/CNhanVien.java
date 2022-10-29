/*Xây dựng lớp CNhanVien, biết:
•	mHo, mTen, mSoSP lần lượt là các thuộc tính họ, tên và số sản phẩm của nhân viên.
•	Viết hàm khởi tạo CNhanVien(String, String, int), hàm này sẽ khởi tạo họ, tên, số sản phẩm của nhân viên; hàm phải kiểm tra số sản phẩm là số lớn hơn hoặc bằng 0, nếu là số âm thì gán giá trị cho mSoSP bằng 0.
•	Viết các hàm lấy và gán giá trị cho thuộc tính của lớp (các hàm get/set).
•	Viết hàm getLuong() để tính lương cho nhân viên, lương = số sản phẩm * đơn giá, với đơn giá tùy thuộc vào số sản phẩm như sau:
Số sản phẩm	Đơn giá
1 - 199		0.5
200 - 399	0.55
400 - 599	0.6
600 trở lên	0.65
•	Viết hàm NhieuHon(CNhanVien nv2): hàm này trả về giá trị true khi số sản phẩm (mSoSP) lớn hơn số sản phẩm của nv2, ngược lại trả về false
(2) Viết hàm main sử dụng lớp CNhanVien theo yêu cầu sau:
•	Cho người dùng nhập vào 2 nhân viên, mỗi nhân viên nhập vào họ, tên, số sản phẩm của họ. Hãy tính và xuất ra lương của từng nhân viên. So sánh và xuất ra thông báo nhân viên nào có số sản phẩm nhiều hơn và nhiều hơn bao nhiêu (Dùng 2 cách so sánh: dùng hàm NhieuHon và không dùng hàm NhieuHon)
*/

import java.util.Scanner;

public class CNhanVien {
    String mHo;
    String mTen;
    int soSP;
    double Luong;

    public CNhanVien(String mHo, String mTen, int soSP){
        this.mHo = mHo;
        this.mTen = mTen;

        if(soSP >= 0){
            this.soSP = soSP;
        }else {
            this.soSP  = 0;
        }
    }
    public CNhanVien(){

    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public double getLuong(){
        if(soSP <= 199 ){
            return Luong  = soSP * 0.5;
        }else if(soSP >= 200 || soSP <= 399){
            return Luong  = soSP * 0.55;
        }else if( soSP >=400 || soSP <= 599){
            return Luong = soSP * 0.6;
        }else {
            return Luong = (soSP * 0.65);
        }
    }

    public boolean NhieuHon(int soSP){
        return true;
    }
    public void Nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap vao ho: ");
        mHo = input.nextLine();
        System.out.print(" Nhap vao Ten: ");
        mTen = input.nextLine();
        System.out.print(" Nhap vao So San Pham: ");
        soSP  = input.nextInt();
    }

    public static String Xuat(){
        return " Ho    |   Ten   |   Luong";
    }
     @Override
    public String toString(){
        return mHo + "     " + mTen + "    " + getLuong();
     }

}
