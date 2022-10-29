import java.util.Scanner;

public class HinhTron {
    //tinh dien tich và chu vi hinh tron ban kinh
     private float banKinh;
     private float tinhChuVi;
    private float tinhDienTich;
    final double P = 3.14;
    public HinhTron(){
         this.banKinh = banKinh;
         this.tinhChuVi = tinhChuVi;
         this.tinhDienTich = tinhDienTich;
    }
    public void Nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap vao ban kinh R = ");
        banKinh = input.nextFloat();
    }
    public void Xuat(){
        System.out.print("Ban kinh hinh tron la=" + banKinh + "\n");
        System.out.print(" Dien tich hinh tron=" + getDienTich() + "\n");
        System.out.print(" Chu vi hinh tron=" + getTinhChuVi());
    }
    public double getTinhChuVi(){
        return this.tinhChuVi = (float) (2*P*this.banKinh);
    }
    public double getDienTich(){
        return this.tinhDienTich = (float) (P*this.banKinh);
    }
}
