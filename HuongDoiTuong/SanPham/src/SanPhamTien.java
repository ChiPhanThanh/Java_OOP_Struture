
//BaiToan : Tạo lớp  gồm 3 thuocj tính là tên, giá, và giảm giá. Lớp gồm 2 phuowngt hc
// là tính thuế nhập khẩu( 10% giá sản phẩm) vf xuất thông tin ra màn hình. thông tin
//man hình gồm: Tên Sản phẩm, đơn giá, giảm giá, Thuế nhập khẩu

import java.util.Scanner;

public class SanPhamTien {
    String Ten;
    double Gia;
    double giamGia;


    public SanPhamTien(String Ten, double Gia, double giamGia){
        this.Ten = Ten;
        this.Gia = Gia;
        this.giamGia = giamGia;
    }

    public SanPhamTien(String Ten, double Gia){
        this.Ten = Ten;
        this.Gia = Gia;
        this.giamGia = 0;
    }

     private double getThueNhapKhau(){
        return Gia * 0.1;
    }

    public void Nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print(" Nhap san pham la:" );
        Ten = s.nextLine();
        System.out.print("  Nhap Gia san pham la:" );
        Gia = s.nextDouble();
        System.out.print("  Nhap Giam gia bao nhieu:" );
        giamGia = s.nextDouble();
    }

    public void Xuat(){
        System.out.print(" Ten san pham la:" +Ten+ "\n" );
        System.out.print(" Gia san pham la:"+ Gia + "\n" );
        System.out.print(" Giam Gia san pham la:" + giamGia);
        System.out.print( "\n"+"Gia con lai "+ getThueNhapKhau());
    }



}
