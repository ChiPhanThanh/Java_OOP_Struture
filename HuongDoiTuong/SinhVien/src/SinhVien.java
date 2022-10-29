import java.util.Scanner;

public class SinhVien {
    String maSinhVien;
    String  hoTen;
    double diemLyThuyet;
    double diemThucHanh;

//    public SinhVien(String maSinhVien, String hoTen, double diemLyThuyet, double diemThucHanh){
//        this.maSinhVien = maSinhVien;
//        this.hoTen = hoTen;
//        this.diemThucHanh = diemThucHanh;
//        this.diemLyThuyet = diemLyThuyet;
//    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap vao ma so sinh vien");
        maSinhVien = input.nextLine();
        System.out.print(" Nhap vao ho ten sinh vien");
        hoTen = input.nextLine();
        System.out.print(" Nhap vao dem thuc hanh  sinh vien");
        diemThucHanh = input.nextDouble();
        System.out.print(" Nhap vao diem ly thuyet sinh vien");
        diemLyThuyet = input.nextDouble();

    }

    public void Xuat(){
        System.out.print("=================================================" + "\n");
        System.out.print(" Ma so sinh vien: " + maSinhVien + "\n");
        System.out.print(" Ho ten sinh vien: " + hoTen +"\n");
        System.out.print(" Diem thuc hanh sinh vien: " + diemThucHanh +"\n" );
        System.out.print(" Diem ly thuyet sinh vien: " + diemLyThuyet +"\n");
        System.out.print("Diem trung binh la:" + diemTrungBinh());
    }

    public double diemTrungBinh()
    {
        double diemTB;
        diemTB = (diemLyThuyet + diemThucHanh)/2;
        if( diemTB >= 5){
            System.out.print("Sinh vien do dau");
        }else{
            System.out.print("Sinh vien khong dau và Rot");
        }
        return diemTB;
    }
}
